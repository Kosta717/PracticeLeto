package com.practice.leto.entity;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcType;
import com.practice.leto.entity.entityEnum.EntityEnums;
import org.hibernate.dialect.type.PostgreSQLEnumJdbcType;

@Entity
@Getter
@Setter
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @JdbcType(PostgreSQLEnumJdbcType.class)
    private EntityEnums status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}
