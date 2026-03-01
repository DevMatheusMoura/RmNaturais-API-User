package com.RmNaturais.API_User.application.user.domain;

import com.RmNaturais.API_User.application.user.api.UserRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID idUser;

    @Column(name = "name", nullable = false)
    @NotNull(message = "required field")
    private String name;

    @Column(name = "username", nullable = false, unique = true)
    @NotNull(message = "required field")
    private String username;

    @Column(name = "password", nullable = false)
    @NotNull(message = "required field")
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    @NotNull(message = "required field")
    private String email;

    @Column(name = "cpf", nullable = false, unique = true)
    @NotNull(message = "required field")
    private String cpf;

    @Column(name = "phone", nullable = false)
    @NotNull(message = "required field")
    private String phone;

    @Column(name = "address", nullable = false)
    @NotNull(message = "required field")
    private String address;

    private LocalDateTime registrationDate;
    private LocalDateTime lastUpdateDate;


    public User(UserRequest userRequest) {
        this.name = userRequest.getName();
        this.username = userRequest.getUsername();
        this.password = userRequest.getPassword();
        this.email = userRequest.getEmail();
        this.cpf = userRequest.getCpf();
        this.phone = userRequest.getPhone();
        this.address = userRequest.getAddress();
        this.registrationDate = LocalDateTime.now();
    }

    public void updateUser(UserRequest userRequest) {
        this.name = userRequest.getName();
        this.username = userRequest.getUsername();
        this.password = userRequest.getPassword();
        this.email = userRequest.getEmail();
        this.cpf = userRequest.getCpf();
        this.phone = userRequest.getPhone();
        this.address = userRequest.getAddress();
        this.lastUpdateDate = LocalDateTime.now();
    }
}
