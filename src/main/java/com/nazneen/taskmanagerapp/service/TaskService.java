package com.nazneen.taskmanagerapp.service;

import com.nazneen.taskmanagerapp.entity.Task;
import com.nazneen.taskmanagerapp.Repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public Task createTask(String title) {
        Task task = new Task(title);
        return taskRepository.save(task);
    }
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
}
