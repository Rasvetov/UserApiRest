package com.apirest.userdept.repositories;

import com.apirest.userdept.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
