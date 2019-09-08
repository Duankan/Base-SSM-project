package com.github.duankang.api.test;

import com.github.duankang.service.service.TaskService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsumerTest extends BaseTest {
    @Autowired
    TaskService taskService;

    @Test
    public void testDubboContact() throws Exception {
        System.out.println(taskService.findTaskById("111"));
        System.in.read();
    }
}
