package com.stanzaliving.core.http.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdDeserializer;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdSerializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeDeserializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeSerializer;
import lombok.experimental.UtilityClass;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalTime;


@UtilityClass
public class Mapper {
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper mapper = converter.getObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(new Java8LocalDateStdSerializer());
        module.addDeserializer(LocalDate.class, new Java8LocalDateStdDeserializer());
        module.addSerializer(new Java8LocalTimeSerializer());
        module.addDeserializer(LocalTime.class, new Java8LocalTimeDeserializer());

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.registerModule(module);
        return converter;
    }


    public void configureRestTemplate(RestTemplate template) {
        for (HttpMessageConverter converter : template.getMessageConverters()) {

            if (converter instanceof AbstractJackson2HttpMessageConverter) {
                ObjectMapper mapper = ((AbstractJackson2HttpMessageConverter) converter).getObjectMapper();

                SimpleModule module = new SimpleModule();
                module.addSerializer(new Java8LocalDateStdSerializer());
                module.addDeserializer(LocalDate.class, new Java8LocalDateStdDeserializer());
                module.addSerializer(new Java8LocalTimeSerializer());
                module.addDeserializer(LocalTime.class, new Java8LocalTimeDeserializer());

                mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
                mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
                mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
                mapper.registerModule(module);
            }
        }
    }
}
