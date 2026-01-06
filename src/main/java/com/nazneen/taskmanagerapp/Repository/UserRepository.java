package com.nazneen.taskmanagerapp.Repository;

import com.nazneen.taskmanagerapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
