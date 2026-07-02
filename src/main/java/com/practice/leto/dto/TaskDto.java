package com.practice.leto.dto;

import com.practice.leto.entity.entityEnum.EntityEnums;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private EntityEnums status;
}
