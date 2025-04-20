package org.ayomide.services;

import org.ayomide.controller.dto.request.UserDtoRequest;
import org.ayomide.controller.dto.response.UserDtoResponse;
import org.ayomide.data.model.User;

import java.util.List;

public interface UserServiceInterface {

    UserDtoResponse createUser(UserDtoRequest userDtoRequest);
    void deleteUser(User user);
    List<User> findAllUser();
}
