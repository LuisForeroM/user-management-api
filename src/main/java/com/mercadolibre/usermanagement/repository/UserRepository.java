package com.mercadolibre.usermanagement.repository;

import com.mercadolibre.usermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //SELECT * FROM USERS WHERE status = userStatus;
    List<User> getUsersByStatus(String userStatus);

    //SELECT * FROM USERS WHERE status = 'userStatus' LIMIT 1;
    User findFirstByStatus(String userStatus);
}
