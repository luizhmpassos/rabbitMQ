package com.javaee.luizhmpassos.rabbitmq.listeners;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.javaee.luizhmpassos.rabbitmq.config.RabbitMQConfig;
import com.javaee.luizhmpassos.rabbitmq.domain.Message;

@Component
public class MessageListener {

	static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @RabbitListener(queues = RabbitMQConfig.QUEUE_MESSAGES)
    public void processMessage(Message message) {
        logger.info("Message Received");
        logger.info("Sebject:" + message.getSubject());
        logger.info("Body:" + message.getBody());
    }
}
