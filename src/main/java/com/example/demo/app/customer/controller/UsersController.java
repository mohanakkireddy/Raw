package com.example.demo.app.customer.controller;

import com.example.demo.app.customer.dto.ResponseDto;
import com.example.demo.app.customer.dto.user.SignupDto;
import com.example.demo.app.customer.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignupDto signupDto){
        return usersService.signUp(signupDto);
    }

}
