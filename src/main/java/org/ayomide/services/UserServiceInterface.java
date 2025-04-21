package org.ayomide.services;

import org.ayomide.controller.dto.request.LoginUserRequest;
import org.ayomide.controller.dto.request.RegisterUserRequest;
import org.ayomide.controller.dto.response.AuctionDtoResponse;
import org.ayomide.controller.dto.response.LoginUserResponse;
import org.ayomide.controller.dto.response.RegisterUserResponse;
import org.ayomide.data.model.User;

import java.util.List;

public interface UserServiceInterface {

    RegisterUserResponse createUser(RegisterUserRequest userDtoRequest);
    LoginUserResponse userLogin(LoginUserRequest loginUserRequest);
    void deleteUser(User user);
    List<User> findAllUser();
}
