package com.kely.rabbitmq.demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.kely.rabbitmq")
@SpringBootApplication
public class RabbitmqConsumerNode2Application {
    static Logger logger = LoggerFactory.getLogger(RabbitmqConsumerNode2Application.class);

    /**
     * rabbitmq消费者启动入口
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumerNode2Application.class, args);

        logger.info("【【【【【消息队列【节点2】-消息消费者启动成功.】】】】】");
    }
}