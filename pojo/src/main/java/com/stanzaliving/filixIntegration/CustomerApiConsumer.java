package com.stanzaliving.filixIntegration;

import com.stanzaliving.core.kafka.consumer.BaseConsumer;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@Lazy(false)
public class CustomerApiConsumer<T> extends BaseConsumer<T> {

}
