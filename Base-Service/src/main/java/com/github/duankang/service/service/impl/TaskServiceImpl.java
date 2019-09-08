package com.github.duankang.service.service.impl;

import com.github.duankang.service.dao.TaskMapper;
import com.github.duankang.service.entities.Task;
import com.github.duankang.service.service.TaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

public class TaskServiceImpl implements TaskService {
    @Resource
    TaskMapper taskMapper;

    @Override
    public Task findTaskById(String id) {
        return taskMapper.selectByPrimaryKey(id);
    }
}
