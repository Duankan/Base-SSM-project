package com.github.duankang.service.test;

import com.github.duankang.service.entities.Task;
import com.github.duankang.service.service.TaskService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceTest extends BaseTest {
    @Autowired
    TaskService taskService;

    @Test
    public void testCreateService() {
        Task task = taskService.findTaskById("111");
        System.out.println(task.getTaskname());
    }
}
