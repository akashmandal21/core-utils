/**
 * 
 */
package com.stanzaliving.core.base.http;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdDeserializer;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdSerializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeDeserializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeSerializer;
import com.stanzaliving.core.base.pair.PairStdDeSerializer;
import com.stanzaliving.core.base.pair.PairStdSerializer;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.tuple.Pair;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author naveen.kumar
 *
 * @date 21-Jun-2020
 *
 **/
@UtilityClass
public class BaseMapperConfig {

	public ObjectMapper getDefaultMapper() {
		ObjectMapper mapper = new ObjectMapper();
		return configureMapper(mapper);
	}

	public ObjectMapper configureMapper(ObjectMapper mapper) {

		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);

		SimpleModule module = new SimpleModule();
		module.addSerializer(new Java8LocalDateStdSerializer());
		module.addDeserializer(LocalDate.class, new Java8LocalDateStdDeserializer());

		module.addSerializer(new Java8LocalTimeSerializer());
		module.addDeserializer(LocalTime.class, new Java8LocalTimeDeserializer());
		
		module.addSerializer(new PairStdSerializer());
		module.addDeserializer(Pair.class, new PairStdDeSerializer());
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
		module.addSerializer(new LocalDateTimeSerializer(dateTimeFormatter));
		module.addDeserializer(LocalDateTime.class, LocalDateTimeDeserializer.INSTANCE);

		mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.registerModule(module);
		
		//mapper.registerModule(new JavaTimeModule());
		return mapper;
	}
}