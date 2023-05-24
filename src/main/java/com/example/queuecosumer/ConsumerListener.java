package com.example.queuecosumer;

import com.example.queuecosumer.config.RabbitMqConfig;
import com.example.queuecosumer.dto.MessageDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @RabbitListener(queues = RabbitMqConfig.QUEUE)
    public void listener(MessageDto messageDto){
        System.out.println("Printing message...");
        System.out.println(messageDto);
    }
}
