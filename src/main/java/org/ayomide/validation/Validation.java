package org.ayomide.validation;

import org.ayomide.controller.dto.request.RegisterUserRequest;
import org.ayomide.exception.EmailNotValidException;

public class Validation {

    public static void validateGmail(RegisterUserRequest request){
        if(!request.getEmail().contains("@gmail.com")){
            throw new EmailNotValidException("Invalid details!!");
        }

    }

}
