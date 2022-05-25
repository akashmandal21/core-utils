package com.stanzaliving.core.kafka.config;

import com.stanzaliving.core.kafka.annotation.PublishToKafka;
import com.stanzaliving.core.kafka.producer.NotificationProducer;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Log4j2
@Aspect
@Configuration
public class PublishToKafkaTopicAOP {

    @Autowired
    private NotificationProducer notificationProducer;

    @Around("@annotation(com.stanzaliving.core.kafka.annotation.PublishToKafka)")
    public Object publishToKafkaTopic(ProceedingJoinPoint joinPoint) {

        Object proceed = null;

        try {

            log.info("method:{} is being called", joinPoint.getSignature().getName());

            MethodSignature signature = (MethodSignature) joinPoint.getSignature();

            Method method = signature.getMethod();

            PublishToKafka publishToKafkaAnnotation = method.getAnnotation(PublishToKafka.class);

            proceed = joinPoint.proceed();

            String[] topics = publishToKafkaAnnotation.topics();

            // Publishing message to Kafka Topic
            if(proceed != null && topics != null && topics.length > 0) {

                String className = proceed.getClass().getName();

                for (String topic : topics) {
                    notificationProducer.publish(topic, className, proceed);

                    log.info("message: {} is published to kafka topic: {}", proceed.toString(), topic);
                }
            }
            log.info("Invoking method:{} is successful", joinPoint.getSignature().getName());

        } catch (Throwable e) {
            log.error("Exception occurred while invoking method: {}", joinPoint.getSignature().getName());
        }
        return proceed;
    }
}
