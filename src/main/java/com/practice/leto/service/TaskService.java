package com.practice.leto.service;

import com.practice.leto.dto.TaskDto;
import com.practice.leto.entity.TaskEntity;
import com.practice.leto.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Transactional(readOnly = true)
    public List<TaskDto> getAllTasks() {
        return taskRepository.findAll().stream()
                .map(entity -> TaskDto.builder()
                        .id(entity.getId())
                        .title(entity.getTitle())
                        .description(entity.getDescription())
                        .status(entity.getStatus())
                        .build()
                ).toList();
    }

    public TaskDto createTask(TaskDto taskDto) {
        TaskEntity entity = new TaskEntity();
        entity.setTitle(taskDto.getTitle());
        entity.setDescription(taskDto.getDescription());
        entity.setStatus(taskDto.getStatus());
        TaskEntity result = taskRepository.save(entity);

        return TaskDto.builder()
                .description(result.getDescription())
                .status(result.getStatus())
                .title(result.getTitle())
                .id(result.getId())
                .build();
    }

    @Transactional
    public void deleteTask(Long id) {
        TaskEntity entity = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Нет такой задачи!"));
        taskRepository.deleteById(entity.getId());
    }

}
