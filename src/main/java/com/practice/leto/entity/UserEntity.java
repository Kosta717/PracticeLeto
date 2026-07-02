package com.practice.leto.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fio;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "userEntity")
    private List<TaskEntity> tasks;
}
