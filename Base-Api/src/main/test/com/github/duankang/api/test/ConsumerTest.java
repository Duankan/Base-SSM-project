package com.github.duankang.api.test;

import com.github.duankang.service.service.TaskService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {
//    @Autowired
//    TaskService taskService;

    @Test
    public void testDubboContact() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        TaskService taskService = (TaskService) context.getBean("Task");
        System.out.println(taskService.findTaskById("111").getTaskname());
        System.in.read();
    }
}
