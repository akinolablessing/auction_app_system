package org.ayomide.controller.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class RegisterUserResponse {
    @Id
    private String id;
    private String userName;
}
