package com.practice.leto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.leto.entity.TaskEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

}
