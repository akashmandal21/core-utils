package com.stanzaliving.core.kafka.config;

import com.stanzaliving.core.kafka.producer.NotificationProducer;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Log4j2
@Aspect
@Configuration
public class PublishToKafkaTopicAOP {

    @Autowired
    private NotificationProducer notificationProducer;

    @Around("@annotation(com.stanzaliving.core.kafka.annotation.PublishToTopic)")
    public Object publishToKafkaTopic(ProceedingJoinPoint joinPoint) {

        Object proceed = null;

        log.info("method:{} is being called", joinPoint.getSignature().getName());

        try {
            proceed = joinPoint.proceed();

            // Publishing message to Kafka Topic
            if(proceed != null) {
                // last args will be KafkaTopic Name
                int numberOfArgs = joinPoint.getArgs().length;
                
                String kafkaTopicAopToPublish = joinPoint.getArgs()[numberOfArgs-1].toString();

                String className = proceed.getClass().getName();

                notificationProducer.publish(kafkaTopicAopToPublish, className, proceed);

                log.info("message: {} is published to kafka topic: {}", proceed.toString(), kafkaTopicAopToPublish);

            }
            log.info("Invoking method:{} is successful", joinPoint.getSignature().getName());

        } catch (Throwable e) {
            log.error("Exception occurred while invoking method: {}", joinPoint.getSignature().getName());
        }
        return proceed;
    }
}
