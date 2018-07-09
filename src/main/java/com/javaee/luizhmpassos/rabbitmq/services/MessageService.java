package com.javaee.luizhmpassos.rabbitmq.services;

import com.javaee.luizhmpassos.rabbitmq.domain.Message;

public interface MessageService {

	void sendMessage(Message message);
}