package com.RmNaturais.API_User.application.user.service;

import com.RmNaturais.API_User.application.user.api.UserListResponse;
import com.RmNaturais.API_User.application.user.api.UserRequest;
import com.RmNaturais.API_User.application.user.api.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {

    UserResponse createUser(UserRequest userRequest);
    void deleteUser(UUID idUser);
    void updateUser(UserRequest userRequest, UUID idUser);
    List<UserListResponse> listUsers();
    UserResponse detailUser(String username, UUID idUser);
}