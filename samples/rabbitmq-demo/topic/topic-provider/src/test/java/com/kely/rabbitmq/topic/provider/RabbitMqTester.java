package com.kely.rabbitmq.topic.provider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqTopicProviderApplication.class)
public class RabbitMqTester {
    /**
     * 用户业务逻辑
     */
    @Autowired
    private UserService userService;

    /**
     * 模拟随机创建用户 & 发送消息到注册用户消息队列
     *
     * @throws Exception
     */
    @Test
    public void testTopicMessage() throws Exception {
        userService.randomCreateUser();
    }
}