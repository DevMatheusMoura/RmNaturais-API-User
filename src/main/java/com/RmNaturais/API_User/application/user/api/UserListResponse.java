package com.RmNaturais.API_User.application.user.api;

import com.RmNaturais.API_User.application.user.domain.User;

import java.util.List;
import java.util.UUID;

public class UserListResponse {

    private UUID id;
    private String name;
    private String username;
    private String phone;

    public static List<UserListResponse> convert(List<User> users) {
        return users.stream()
                .map(UserListResponse::new)
                .toList();
    }

    public UserListResponse(User user) {
        this.id = user.getIdUser();
        this.name = user.getName();
        this.username = user.getUsername();
        this.phone = user.getPhone();
    }
}
