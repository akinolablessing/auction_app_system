package org.ayomide.validation;

import org.ayomide.controller.dto.request.RegisterUserRequest;

public class Validation {

    public void validateGmail(RegisterUserRequest request){
        if(!request.getEmail().contains("@gmail.com")){
            throw new RuntimeException();
        }
    }

}
