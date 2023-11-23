package com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.entity;

import com.taskmanagement.taskmanagerapi.domain.entities.task.TaskStatus;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "task")
@Entity(name = "TaskEntity")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TaskEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String decription;
    private String startDate;
    private String endDate;
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

}
