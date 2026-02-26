package com.RmNaturais.API_User.application.user.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id_User;

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


}
