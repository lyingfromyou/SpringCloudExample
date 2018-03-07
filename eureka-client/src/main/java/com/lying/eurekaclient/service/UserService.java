package com.lying.eurekaclient.service;

import com.lying.eurekaclient.orm.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<User, Long> {
}
