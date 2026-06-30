package com.practice.leto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.leto.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
