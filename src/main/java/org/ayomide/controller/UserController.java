package org.ayomide.controller;

import org.ayomide.controller.dto.request.RegisterUserRequest;
import org.ayomide.controller.dto.response.ApiResponse;
import org.ayomide.controller.dto.response.RegisterUserResponse;
import org.ayomide.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    public ResponseEntity<?> registerUser(RegisterUserRequest request){
        try {
            RegisterUserResponse response =  userService.createUser(request);
            return ResponseEntity<>(new ApiResponse());
        }cat

    }
}
