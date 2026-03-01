package com.RmNaturais.API_User.application.user.infra;

import com.RmNaturais.API_User.application.user.domain.User;
import com.RmNaturais.API_User.application.user.handler.APIException;
import com.RmNaturais.API_User.application.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class UserInfraRepository implements UserRepository {

    private final UserSpringDataJPARepository userSpringDataJPARepository;

    @Override
    public User save(User user) {
        log.info("[start] UserInfraRepository - salva");
        userSpringDataJPARepository.save(user);
        log.debug("[finish] UserInfraRepository - salva");
        return user;
    }


    @Override
    public User FindById(UUID idUser) {
        log.info("[start] UserInfraRepository - FindById");
        User user = userSpringDataJPARepository.findById(idUser)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "User not found"));
        log.debug("[finish] UserInfraRepository - FindById");
        return user;
    }

    @Override
    public void delete(UUID idUser) {
        log.info("[start] UserInfraRepository - deletar");
        userSpringDataJPARepository.deleteById(idUser);
        log.debug("[finish] UserInfraRepository - deletar");
    }

    @Override
    public void update(User updatedUser) {
        log.info("[start] UserInfraRepository - update");
        userSpringDataJPARepository.save(updatedUser);
        log.debug("[finish] UserInfraRepository - update");
    }

    @Override
    public List<User> allUsers() {
        log.info("[start] UserInfraRepository - allUsers");
        List<User> allusers = userSpringDataJPARepository.findAll();
        log.debug("[finish] UserInfraRepository - allUsers");
        return allusers;
    }
}
