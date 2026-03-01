package com.RmNaturais.API_User.application.user.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class UserRequest {

    private UUID idUser;

    @NotNull(message = "required field")
    private String name;

    @NotNull(message = "required field")
    private String username;

    @NotNull(message = "required field")
    private String password;

    @NotNull(message = "required field")
    private String email;

    @CPF(message = "required field")
    private String cpf;

    @NotBlank(message = "required field")
    private LocalDate dataNascimento;

    @NotNull(message = "required field")
    private String phone;

    @NotNull(message = "required field")
    private String address;

    private LocalDateTime registrationDate;
    private LocalDateTime lastUpdateDate;

}
