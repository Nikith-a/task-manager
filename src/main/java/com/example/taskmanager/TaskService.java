package com.example.taskmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Get all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get task by ID
    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
    }

    // Create a task
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Update a task
    public Task updateTask(Long id, Task updatedTask) {
        taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
        updatedTask.setId(id);
        return taskRepository.save(updatedTask);
    }

    // Delete a task
    public void deleteTask(Long id) {
        taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
        taskRepository.deleteById(id);
    }
}