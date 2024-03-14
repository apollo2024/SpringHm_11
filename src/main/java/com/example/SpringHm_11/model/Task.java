package com.example.SpringHm_11.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="tasks")

public class Task {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Enumerated
    private TaskStatus status = TaskStatus.NOT_STARTED;

    private LocalDateTime creatingData = LocalDateTime.now();

}

