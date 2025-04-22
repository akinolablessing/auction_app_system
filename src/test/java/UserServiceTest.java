import org.ayomide.Main;
import org.ayomide.controller.dto.request.LoginUserRequest;
import org.ayomide.controller.dto.request.RegisterUserRequest;
import org.ayomide.controller.dto.response.LoginUserResponse;
import org.ayomide.controller.dto.response.RegisterUserResponse;
import org.ayomide.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Main.class)
public class UserServiceTest {
    private final UserService userService;

    @Autowired
    public UserServiceTest(UserService service){
        this.userService = service;
    }
    @Test
    public void testThatRegisterUser(){
        RegisterUserRequest request = registerUser();
        RegisterUserResponse response = userService.createUser(request);
        assertEquals("User Register Successfully",response.getMessage());
    }
    public RegisterUserRequest registerUser(){
        RegisterUserRequest request = new RegisterUserRequest();
        request.setUserName("daniel");
        request.setEmail("daniel@gmail.com");
        request.setPassword("daniel123");
        return  request;
    }
    @Test
    public void testThatRegisterTwoUser(){
       RegisterUserRequest requestOne =  registerFirstUser();
        RegisterUserRequest requestTwo =  registerSecondUser();
        RegisterUserResponse responseOne = userService.createUser(requestOne);
        RegisterUserResponse responseTwo = userService.createUser(requestTwo);
        assertEquals("User Register Successfully",responseOne.getMessage());
        assertEquals("User Register Successfully",responseTwo.getMessage());
    }
    public RegisterUserRequest registerFirstUser(){
        RegisterUserRequest request = new RegisterUserRequest();
        request.setUserName("Onyii");
        request.setEmail("onyii@gmail.com");
        request.setPassword("ony@21");
        return  request;
    }
public RegisterUserRequest registerSecondUser(){
    RegisterUserRequest request = new RegisterUserRequest();
    request.setUserName("Enyy");
    request.setEmail("enyy@gmail.com");
    request.setPassword("enyy@21");
    return  request;
}
@Test
public void testThatLoginUser(){
        LoginUserRequest loginUserRequest = loginUser();
    LoginUserResponse loginUserResponse = userService.userLogin(loginUserRequest);
    assertEquals("Login Successful",loginUserResponse.getMessage());

}
public LoginUserRequest loginUser(){
        LoginUserRequest request = new LoginUserRequest();
        request.setEmail("daniel@gmail.com");
        request.setPassword("daniel123");
        return request;
}
}
