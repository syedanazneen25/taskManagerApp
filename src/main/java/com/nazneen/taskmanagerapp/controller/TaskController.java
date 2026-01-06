package com.nazneen.taskmanagerapp.controller;

import com.nazneen.taskmanagerapp.entity.Task;
import com.nazneen.taskmanagerapp.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping
    public Task create(@RequestBody Map<String, String> body) {
        String title = body.get("title");
        return taskService.createTask(title);
    }
    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }
}

