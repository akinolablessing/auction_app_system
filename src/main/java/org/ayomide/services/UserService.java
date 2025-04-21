package org.ayomide.services;


import org.ayomide.controller.dto.request.LoginUserRequest;
import org.ayomide.controller.dto.request.RegisterUserRequest;
import org.ayomide.controller.dto.response.LoginUserResponse;
import org.ayomide.controller.dto.response.RegisterUserResponse;

import org.ayomide.data.model.User;
import org.ayomide.data.repository.UserRepository;
import org.ayomide.exception.LoginException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.ayomide.validation.Validation.validateGmail;


@Service
public class UserService implements UserServiceInterface{
    @Autowired
    private UserRepository userRepository;

    @Override
    public RegisterUserResponse createUser(RegisterUserRequest userDtoRequest) {
        RegisterUserResponse response = new RegisterUserResponse();
        User user = new User();
        user.setUserName(userDtoRequest.getUserName());
        validateGmail(userDtoRequest);
        user.setEmail(userDtoRequest.getEmail());
        user.setPassword(userDtoRequest.getPassword());
        userRepository.save(user);
        response.setMessage("User Register Successfully");
        return response;
    }

    @Override
    public LoginUserResponse userLogin(LoginUserRequest loginUserRequest) {
        LoginUserResponse loginUserResponse = new LoginUserResponse();
        User user = userRepository.findByEmail(loginUserRequest.getEmail());
        if(user.getEmail().equals(loginUserRequest.getEmail())
                && user.getPassword().equals(loginUserRequest.getPassword())){
          user.setLogin(true);
          userRepository.save(user);
        }
        else {
          throw  new LoginException("Invalid Login Details!!");
        }
        loginUserResponse.setMessage("Login Successful");
        return loginUserResponse;
    }

    @Override
    public void leaveFeedBack() {

    }


//    @Override
//    public List<User> findAllUser() {
//        return userRepository.findAll();
//    }
}
