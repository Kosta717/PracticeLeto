package com.practice.leto.controller;

import com.practice.leto.dto.TaskDto;
import com.practice.leto.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping()
    public List<TaskDto> getAllTasks() { return taskService.getAllTasks(); }

    @PostMapping()
    public TaskDto createTask(@RequestBody TaskDto taskDto) { return taskService.createTask(taskDto); }

    @ResponseStatus(HttpStatus.CREATED)
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
