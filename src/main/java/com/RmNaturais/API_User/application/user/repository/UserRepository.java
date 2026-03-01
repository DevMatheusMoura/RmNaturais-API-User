package com.RmNaturais.API_User.application.user.repository;

import com.RmNaturais.API_User.application.user.domain.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {


    User save(User user);

    User FindById(UUID idUser);

    void delete(UUID idUser);

    void update(User updatedUser);

    List<User> allUsers();
}
