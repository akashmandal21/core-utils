package com.stanzaliving.core.statustracker.consumer;

import java.util.Objects;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.kafka.consumer.BaseConsumer;
import com.stanzaliving.core.statustracker.dto.StatusTrackerDto;
import com.stanzaliving.core.statustracker.service.StatusTrackerService;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
@Lazy(false)
public class StatusTrackerConsumer<T> extends BaseConsumer<StatusTrackerDto> {

	@Autowired
	private StatusTrackerService statusTrackerService;

	@Autowired
	private ObjectMapper objectMapper;

	@KafkaListener(topics = {
			"${kafka.topic.statustracker}" }, idIsGroup = false, id = "${spring.kafka.consumer.group-id}")
	public void receive(ConsumerRecords<String, String> records) {

		if (records != null && !records.isEmpty()) {

			log.debug("StatusTrackerConsumer:: Received " + records.count() + " record(s) to process");

			try {

				for (ConsumerRecord<String, String> record : records) {

					log.debug("StatusTrackerConsumer:: Received Payload= " + record);

					StatusTrackerDto statusTrackerDto = objectMapper.readValue(record.value(), StatusTrackerDto.class);

					log.info("StatusTrackerConsumer:: Email Record: " + statusTrackerDto);

					if (Objects.nonNull(statusTrackerDto)) {

						statusTrackerService.createEntryForStatus(statusTrackerDto);

					} else {

						log.warn("StatusTrackerConsumer:: Record Missing mandatory parameters");
					}
				}
			} catch (Exception e) {
				log.error("statusTrackerDto:: Error while statusTrackerDto : ", e);
			}

		}

	}
}