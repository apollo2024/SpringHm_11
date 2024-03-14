package com.example.SpringHm_11.repositories;

import com.example.SpringHm_11.model.Task;
import com.example.SpringHm_11.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> findTasksByStatus(TaskStatus status);
}
