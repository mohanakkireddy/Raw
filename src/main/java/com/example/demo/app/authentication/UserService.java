package com.example.demo.app.authentication;

import com.example.demo.app.authentication.dto.UserDTO;
import com.example.demo.app.authentication.dto.UserLoginDTO;

public interface UserService {
    String addUser(UserDTO userDTO);

    LoginResponse loginUser(UserLoginDTO userLoginDTO);
}
