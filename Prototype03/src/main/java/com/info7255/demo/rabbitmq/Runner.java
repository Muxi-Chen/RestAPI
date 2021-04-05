package com.info7255.demo.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

//@Component
public class Runner  {

  private final RabbitTemplate rabbitTemplate;
  private final IndexingListener receiver;

  public Runner(IndexingListener receiver, RabbitTemplate rabbitTemplate) {
    this.receiver = receiver;
    this.rabbitTemplate = rabbitTemplate;
  }



}
