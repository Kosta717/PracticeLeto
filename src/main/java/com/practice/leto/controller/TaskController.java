package com.practice.leto.controller;

import com.practice.leto.entity.TaskEntity;
import com.practice.leto.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/task/get")
    public List<TaskEntity> getAllTasks() { return taskService.getAllTasks(); }

    @PostMapping("/task/post")
    public TaskEntity createTask(TaskEntity taskEntity) { return taskService.createTask(taskEntity); }

    @DeleteMapping("task/{id}")
    public void deleteTask(Long id) { taskService.deleteTask(id); }
}
