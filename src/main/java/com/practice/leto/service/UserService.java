package com.practice.leto.service;

import com.practice.leto.dto.TaskDto;
import com.practice.leto.dto.UserDto;
import com.practice.leto.dto.dtoEnum.DtoEnum;
import com.practice.leto.entity.TaskEntity;
import com.practice.leto.entity.UserEntity;
import com.practice.leto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(entity -> UserDto.builder()
                        .id(entity.getId())
                        .fio(entity.getFio())
                        .email(entity.getEmail())
                        .build()
                ).toList();
    }

    public UserDto createUser(UserDto userDto)
    {
        UserEntity entity = new UserEntity();
        entity.setFio(userDto.getFio());
        entity.setEmail(userDto.getEmail());
        UserEntity result = userRepository.save(entity);

        return UserDto.builder()
                .fio(result.getFio())
                .email(result.getEmail())
                .id(result.getId())
                .build();
    }

}
