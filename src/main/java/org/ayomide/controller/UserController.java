package org.ayomide.controller;

import lombok.AllArgsConstructor;
import org.ayomide.controller.dto.request.LeaveFeedBackRequest;
import org.ayomide.controller.dto.request.LoginUserRequest;
import org.ayomide.controller.dto.request.RegisterUserRequest;
import org.ayomide.controller.dto.response.ApiResponse;
import org.ayomide.controller.dto.response.LeaveFeedBackResponse;
import org.ayomide.controller.dto.response.LoginUserResponse;
import org.ayomide.controller.dto.response.RegisterUserResponse;
import org.ayomide.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    private UserController(UserService service){
        this.userService = service;
    }

    @PostMapping("/register-user")
    public ResponseEntity<?> registerUser(@RequestBody RegisterUserRequest request){
        try {
            RegisterUserResponse response =  userService.createUser(request);
            return new ResponseEntity<>(new ApiResponse(true, response), HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>(new ApiResponse(false, exception.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/login-user")
    public ResponseEntity<?> loginUser(@RequestBody LoginUserRequest loginUserRequest){
        try {
            LoginUserResponse response = userService.userLogin(loginUserRequest);
            return new ResponseEntity<>(new ApiResponse(true,response), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),HttpStatus.OK);
        }
    }
    @PostMapping
    public ResponseEntity<?> userFeedBack(@RequestBody LeaveFeedBackRequest leaveFeedBackRequest){
        try {
            LeaveFeedBackResponse response = userService.leaveFeedBack(leaveFeedBackRequest);
            return new ResponseEntity<>(new ApiResponse(true,response), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),HttpStatus.OK);
        }
    }
}
