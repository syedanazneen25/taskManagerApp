package com.nazneen.taskmanagerapp.Repository;

import com.nazneen.taskmanagerapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}