package com.example.SpringHm_11.services;

import com.example.SpringHm_11.model.Task;
import com.example.SpringHm_11.model.TaskStatus;
import com.example.SpringHm_11.repositories.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepository repository;


    public Task addTask(Task task){
        return repository.save(task);
    }

    public List<Task> getAllTasks(){
        return repository.findAll();
    }

    public List<Task> getTasksByStatus(TaskStatus status){
        return repository.findTasksByStatus(status);
    }

    public Task updateTaskStatus(Long id, Task task){
        task.setId(id);
        return repository.save(task);
    }

    public void deleteTask(Long id){
        repository.deleteById(id);
    }
}
