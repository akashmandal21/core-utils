package com.stanzaliving.core.kafka.consumer.impl;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.log4j.Logger;

import com.stanzaliving.core.kafka.consumer.Consumer;

public abstract class BaseConsumer<K, V> implements Consumer<K, V> {

	private static final Logger log = Logger.getLogger(BaseConsumer.class);

	@SuppressWarnings("rawtypes")
	public static final List<BaseConsumer> consumers = new CopyOnWriteArrayList<>();

	Properties properties = null;
	KafkaConsumer<K, V> consumer = null;
	List<String> topics = null;
	private AtomicBoolean shutdown;
	private CountDownLatch shutdownLatch;

	public abstract List<String> getTopics();

	public abstract int getPollDuration();

	public BaseConsumer() {
		consumers.add(this);
	}

	@Override
	public void configure(Properties properties) {
		this.properties = properties;
		this.consumer = new KafkaConsumer<>(properties);
		this.consumer.subscribe(getTopics());
		this.shutdown = new AtomicBoolean(false);
		this.shutdownLatch = new CountDownLatch(1);
	}

	@Override
	public void run() {
		try {
			while (!shutdown.get()) {
				ConsumerRecords<K, V> records = this.consumer.poll(getPollDuration());
				if (records != null && !records.isEmpty()) {

					subscribe(records);
					log.info(getTopics() + " size : " + records.count() + " processed");

					commit();
				}
			}
		} catch (Exception e) {
			log.error("Exception while parsing json : ", e);
		} finally {
			consumer.close();
			shutdownLatch.countDown();
			log.info(this.getClass().getName() + " Consumer exited");
		}
	}

	private void commit() {
		try {
			this.consumer.commitSync();
		} catch (Exception e) {
			log.error("commit api get failed : ", e);
		}
	}

	public boolean shutdown() throws InterruptedException {
		// Check if shutdown is already in process
		if (shutdownLatch.getCount() == 0) {
			return false;
		}
		shutdown.set(true);
		shutdownLatch.await();
		return true;
	}

	@SuppressWarnings("rawtypes")
	public static List<BaseConsumer> getConsumers() {
		return consumers;
	}

}