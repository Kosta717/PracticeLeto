package com.practice.leto.controller;

import com.practice.leto.entity.TaskEntity;
import com.practice.leto.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/get")
    public List<TaskEntity> getAllTasks() { return taskService.getAllTasks(); }

    @PostMapping("/post")
    public TaskEntity createTask(TaskEntity taskEntity) { return taskService.createTask(taskEntity); }

    @DeleteMapping("/{id}")
    public void deleteTask(Long id) { taskService.deleteTask(id); }
}
