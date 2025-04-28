package org.ayomide.validation;

import org.ayomide.controller.dto.request.RegisterUserRequest;
import org.ayomide.exception.EmailNotValidException;
import org.ayomide.exception.PasswordNotValid;
import org.ayomide.exception.UserNameNotValidateException;

public class Validation {

    public static void validateGmail(RegisterUserRequest request){
        if(!request.getEmail().contains("@gmail.com")){
            throw new EmailNotValidException("Invalid details!!");
        }

    }
    public  static void validateUserName(RegisterUserRequest request){
        if (request.getUserName() == null || request.getUserName().isEmpty() || !request.getUserName().matches(".*[A-Za-z].*")) {
            throw new UserNameNotValidateException("Name cannot be empty!!");
        }
    }
    public static void validateUserPassword(RegisterUserRequest request){
        if(request.getPassword() == null || request.getPassword().isEmpty() || !request.getPassword().matches(".*[A-Za-z-0-9].*")){
            throw new PasswordNotValid("Password cannot be empty!!");
        }
    }
}
