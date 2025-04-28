package org.ayomide.data.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class User {
    @Id
    private String id;
    private String userName;
    private String password;
    @Indexed(unique = true)
    private String email;
    private boolean isLogin;

}
