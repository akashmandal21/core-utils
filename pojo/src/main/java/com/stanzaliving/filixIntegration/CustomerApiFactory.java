package com.stanzaliving.filixIntegration;
import java.util.Map;

public abstract class CustomerApiFactory {

    public abstract void produceOnKafkaForCreate(Map<Object, Object> dataMap);

    public abstract void produceOnKafkaForUpdate(Map<Object, Object> dataMap);

}
