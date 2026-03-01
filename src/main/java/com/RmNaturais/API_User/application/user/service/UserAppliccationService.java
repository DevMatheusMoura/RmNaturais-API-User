package com.RmNaturais.API_User.application.user.service;

import com.RmNaturais.API_User.application.user.api.UserListResponse;
import com.RmNaturais.API_User.application.user.api.UserRequest;
import com.RmNaturais.API_User.application.user.api.UserResponse;
import com.RmNaturais.API_User.application.user.domain.User;
import com.RmNaturais.API_User.application.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserAppliccationService implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        log.info("[start] UserAppliccationService - createUser");
        User user = userRepository.save(new User(userRequest));
        log.debug("[finish] UserAppliccationService - createUser");
        return new UserResponse(user);
    }

    @Override
    public UserResponse detailUser(String username, UUID id) {
        log.info("[start] UserAppliccationService - detailUser");
        User user = userRepository.FindById(id);
        if (!user.getUsername().equals(username)) {
            throw new RuntimeException("User not found");
        }
        UserResponse userResponse = new UserResponse(user);
        log.debug("[finish] UserAppliccationService - detailUser");
        return userResponse;
    }

    @Override
    public void updateUser(UserRequest userRequest, UUID idUser) {
        log.info("[start] UserAppliccationService - updateUser");
        User updatedUser = userRepository.FindById(idUser);
        userRepository.update(updatedUser);
        userRepository.save(new User(userRequest));
        log.debug("[finish] UserAppliccationService - updateUser");

    }

    @Override
    public List<UserListResponse> listUsers() {
        log.info("[start] UserAppliccationService - listUsers");
        List<User> users = userRepository.allUsers();
        log.debug("[finish] UserAppliccationService - listUsers");
        return UserListResponse.convert(users);
    }

    @Override
    public void deleteUser(UUID idUser) {
        log.info("[start] UserAppliccationService - deleteUser");
        userRepository.delete(idUser);
        log.debug("[finish] UserAppliccationService - deleteUser");
    }
}
