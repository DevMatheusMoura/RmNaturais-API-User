package com.RmNaturais.API_User.application.user.infra;

import com.RmNaturais.API_User.application.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserSpringDataJPARepository extends JpaRepository <User, UUID > {
}
