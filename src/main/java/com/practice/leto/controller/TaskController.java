package com.practice.leto.controller;

import com.practice.leto.dto.TaskDto;
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
    public List<TaskDto> getAllTasks() { return taskService.getAllTasks(); }

    @PostMapping("/post")
    public TaskDto createTask(@RequestBody TaskDto taskDto) { return taskService.createTask(taskDto); }

    @DeleteMapping("/{id}")
    public void deleteTask(Long id) { taskService.deleteTask(id); }
}
