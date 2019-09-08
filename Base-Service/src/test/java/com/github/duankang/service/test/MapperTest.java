package com.github.duankang.service.test;

import com.github.duankang.service.dao.TaskMapper;
import com.github.duankang.service.entities.Task;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class MapperTest extends BaseTest {
    @Resource
    TaskMapper taskMapper;

    @Test
    public void testConnectDB() throws Exception {
        Task task = taskMapper.selectByPrimaryKey("111");
        System.out.println(task.getTaskid());
        System.out.println(task.getTaskname());
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
//        context.start();
        //需要阻隔时间
        System.in.read();
    }
}
