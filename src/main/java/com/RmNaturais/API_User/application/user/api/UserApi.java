package com.RmNaturais.API_User.application.user.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/users")
public interface UserApi {

    @PostMapping
    @ResponseStatus (HttpStatus.CREATED)
    UserResponse createUser(@RequestBody @Valid UserRequest userRequest);

    @GetMapping
    @ResponseStatus (HttpStatus.OK)
    List<UserListResponse> listUsers();

    @GetMapping ("/{id_User}")
    @ResponseStatus  (HttpStatus.OK)
    UserResponse detailUser(@RequestParam String username,@PathVariable UUID id);

    @PutMapping ("/{id_User}/update-user")
    @ResponseStatus (HttpStatus.OK)
    UserResponse updateUser(@RequestBody @Valid  userRequest userRequest, @PathVariable UUID id);

     @DeleteMapping("/{id_User}/delete-user")
     @ResponseStatus (HttpStatus.NO_CONTENT)
     void deleteUser(@PathVariable UUID id);


}
