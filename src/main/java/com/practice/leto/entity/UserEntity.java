package com.practice.leto.entity;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserEntity {
    private String fio;
    private String job;
}
