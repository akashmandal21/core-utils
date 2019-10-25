package com.stanzaliving.core.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.core.env.Environment;

public interface Consumer<K, V> extends Runnable {

	void subscribe(ConsumerRecords<K, V> records);

	void configure(Environment environment);
}