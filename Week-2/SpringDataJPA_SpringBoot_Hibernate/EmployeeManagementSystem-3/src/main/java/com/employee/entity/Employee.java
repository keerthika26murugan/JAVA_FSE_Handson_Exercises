package com.employee.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

private String email;

@CreatedDate
private LocalDateTime createdDate;

@LastModifiedDate
private LocalDateTime modifiedDate;

@ManyToOne
@JoinColumn(name="department_id")
private Department department;
}
