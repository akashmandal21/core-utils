package com.stanzaliving.core.kafka.consumer;

import com.stanzaliving.core.base.StanzaConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

import java.util.Objects;

@Log4j2
public abstract class BaseConsumer<T> {

	@Autowired
	protected ObjectMapper objectMapper;

	protected T getDto(ConsumerRecord<String, String> record) {

		record.headers().forEach(header -> {
			if (StanzaConstants.MESSAGE_ID.equalsIgnoreCase(header.key()))
				MDC.put(StanzaConstants.GUID, new String(header.value()));
		});

		T data = null;

		log.info("BaseConsumer:: Received Payload {}", record);

		try {

			if (StringUtils.isNotBlank(record.key())) {

				@SuppressWarnings("unchecked")
				Class<T> clazz = (Class<T>) Class.forName(record.key());

				log.info("BaseConsumer:: Retrived class: {}", clazz);

				data = objectMapper.readValue(record.value(), clazz);

				log.info("BaseConsumer:: Retrieved object: {}", data);

			} else {
				log.warn("BaseConsumer:: Kafka Record Missing key");
			}

		} catch (Exception e) {
			log.error("BaseConsumer:: Error casting Kafka record to desrired dto: ", e);
		} finally {
			MDC.remove(StanzaConstants.GUID);
		}

		return data;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected T getDto(ConsumerRecord<String, String> record, Class clazz) {

		record.headers().forEach(header -> {
			if (StanzaConstants.MESSAGE_ID.equalsIgnoreCase(header.key()))
				MDC.put(StanzaConstants.GUID, new String(header.value()));
		});

		T data = null;

		log.info("BaseConsumer:: Received Payload {}", record);

		try {

			if (Objects.nonNull(clazz)) {

				log.info("BaseConsumer:: Retrived class: {}", clazz);

				data = (T) objectMapper.readValue(record.value(), clazz);

				log.info("BaseConsumer:: Retrieved object: {}", data);

			} else {
				log.warn("BaseConsumer:: Kafka Record Missing key");
			}

		} catch (Exception e) {
			log.error("BaseConsumer:: Error casting Kafka record to desrired dto: ", e);
		} finally {
			MDC.remove(StanzaConstants.GUID);
		}

		return data;
	}
}