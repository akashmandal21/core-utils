package com.stanzaliving.filixIntegration;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.booking.dto.request.BookingEvent;
import com.stanzaliving.core.kafka.consumer.BaseConsumer;
import com.stanzaliving.core.kafka.dto.KafkaDTO;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Log4j2
@Service
@Lazy(false)
public class CustomerApiConsumer<T> extends BaseConsumer<T> {
//    @Autowired
//    AsyncCustomerApi asyncCustomerApi;
//    @Autowired
//    private ObjectMapper objectMapper;
//    @KafkaListener(topics = { "new_lead_notify_V2" }, idIsGroup = false, id = "filix-consumer-group", autoStartup = "${kafka.consumer.autostart}")
//    public void receive(ConsumerRecords<String, String> records) {
//        if (records != null && !records.isEmpty()) {
//            log.info("Filix Records:: Received: {} record(s) to process", records.count());
//            try {
//                for (ConsumerRecord<String, String> record : records) {
//                    log.info("FilixConsumer:: Received Payload= {}", record);
//                    KafkaDTO kafkaDTO=objectMapper.readValue(record.value(),KafkaDTO.class);
//                    log.info("FilixConsumer::  Record: {} ",kafkaDTO);
//                    if(Objects.nonNull(kafkaDTO)){
//                        asyncCustomerApi.produceKafkaPacketForApi(kafkaDTO);
//
//                    }
//
//                }
//            } catch (Exception e) {
//                log.error("FilixConsumer:: Error while Processing Kafka Dto : ", e);
//            }
//        }
//    }
}
