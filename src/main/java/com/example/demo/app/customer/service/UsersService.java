package com.example.demo.app.customer.service;

import com.example.demo.app.customer.dto.ResponseDto;
import com.example.demo.app.customer.dto.user.SignupDto;
import com.example.demo.app.customer.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UsersRepository usersRepository;

    public ResponseDto signUp(SignupDto signupDto) {
        ResponseDto responseDto = new ResponseDto("success", "dummy repo");
        return responseDto;
    }
}
