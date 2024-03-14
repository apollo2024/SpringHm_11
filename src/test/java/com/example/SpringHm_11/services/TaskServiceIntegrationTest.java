package com.example.SpringHm_11.services;

import com.example.SpringHm_11.model.Task;
import com.example.SpringHm_11.repositories.TaskRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class TaskServiceIntegrationTest {
    @MockBean
    private TaskRepository taskRepository;
    @Autowired
    private TaskService taskService;
    @Test
    @DisplayName("addTaskIntegrationTest")
    public void addTaskIntegrationTest(){
        Task task = new Task();
        task.setDescription("Test task");

        given(taskRepository.save(task)).willReturn(task);

        Task resultTask = taskService.addTask(task);

        verify(taskRepository).save(task);
        assertEquals("message", resultTask.getDescription(),"Test task");
    }
}
