package org.ayomide.services;

import org.ayomide.controller.dto.request.RegisterUserDto;
import org.ayomide.controller.dto.request.RegisterUserRequest;
import org.ayomide.controller.dto.request.UserDtoRequest;
import org.ayomide.controller.dto.response.RegisterUserResponse;
import org.ayomide.controller.dto.response.UserDtoResponse;
import org.ayomide.data.model.User;
import org.ayomide.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface{
    @Autowired
    private UserRepository userRepository;

    @Override
    public RegisterUserResponse createUser(RegisterUserRequest userDtoRequest) {
        User user = new User();
        user.setUserName(userDtoRequest.getUserName());
        user.setEmail();
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
