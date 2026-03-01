package com.RmNaturais.API_User.application.user.api;

import com.RmNaturais.API_User.application.user.domain.User;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class UserResponse {

    private UUID id;

    @NotNull(message = "required field")
    private String name;

    @NotNull(message = "required field")
    private String username;

    @NotNull(message = "required field")
    private String password;

    @NotNull(message = "required field")
    private String email;

    @NotNull(message = "required field")
    private String cpf;

    @NotNull(message = "required field")
    private String phone;

    @NotNull(message = "required field")
    private String address;

    public void User(UserRequest userRequest) {
        this.id = userRequest.getIdUser();
        this.name = userRequest.getName();
        this.username = userRequest.getUsername();
        this.password = userRequest.getPassword();
        this.email = userRequest.getEmail();
        this.cpf = userRequest.getCpf();
        this.phone = userRequest.getPhone();
        this.address = userRequest.getAddress();
    }

    public UserResponse(User user) {


    }
}
