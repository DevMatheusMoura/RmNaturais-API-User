package com.RmNaturais.API_User.application.user.api;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class UserRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "UUID",name = "idUser",updatable = false, nullable = false,unique = true)
    private UUID id_User;

    @NotNull(message = "required field")
    private String name;

    @NotNull(message = "required field")
    private String username;

    @NotNull(message = "required field")
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    @NotNull(message = "required field")
    private String email;

    @Column(name = "cpf", nullable = false, unique = true)
    @CPF(message = "required field")
    private String cpf;

    @Column(name = "dateOfBirth", nullable = false)
    @NotBlank(message = "required field")
    private LocalDate dataNascimento;

    @Column(name = "phone", nullable = false)
    @NotNull(message = "required field")
    private String phone;

    @Column(name = "address", nullable = false)
    @NotNull(message = "required field")
    private String address;

    private LocalDateTime registrationDate;
    private LocalDateTime lastUpdateDate;


}
