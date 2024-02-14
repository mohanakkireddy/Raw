package com.example.demo.app.authentication;

import com.example.demo.app.authentication.dto.UserDTO;
import com.example.demo.app.authentication.dto.UserLoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("register")
public class LoginController {

    @Autowired
    private UserService userService;
    @PostMapping(path = "/signup")
    public String registerUser(@RequestBody UserDTO userDTO)
    {
        String id = userService.addUser(userDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody UserLoginDTO userLoginDTO)
    {
        LoginResponse loginResponse = userService.loginUser(userLoginDTO);
        return ResponseEntity.ok(loginResponse);
    }


}
