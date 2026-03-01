package com.RmNaturais.API_User.application.user.api;

import com.RmNaturais.API_User.application.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserService userService;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        log.info("[start] UserController - createUser");
        UserResponse userCreated = userService.createUser(userRequest);
        log.debug("[finish] UserController - createUser");
        return userCreated;
    }

    @Override
    public List<UserListResponse> listUsers() {
        log.info("[start] UserController - listUsers");
        List<UserListResponse> users = userService.listUsers();
        log.debug("[finish] UserController - listUsers");
        return users;
    }

    @Override
    public UserResponse detailUser(String username, UUID id) {
        log.info("[start] UserController - detailUser");
        UserResponse detailedUser = userService.detailUser(username,id);
        log.debug("[finish] UserController - detailUser");
        return detailedUser;
    }

    @Override
    public void updateUser(UserRequest userRequest, UUID id) {
        log.info("[start] UserController - updateUser");
        userService.updateUser(userRequest,id);
        log.debug("[finish] UserController - updateUser");

    }

    @Override
    public void deleteUser(UUID id) {
        log.info("[start] UserController - deleteUser");
        userService.deleteUser(id);
        log.debug("[finish] UserController - deleteUser");

    }
}
