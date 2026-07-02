package com.practice.leto.dto;

import com.practice.leto.entity.entityEnum.EntityEnums;
import lombok.Data;

@Data
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private EntityEnums status;
}
