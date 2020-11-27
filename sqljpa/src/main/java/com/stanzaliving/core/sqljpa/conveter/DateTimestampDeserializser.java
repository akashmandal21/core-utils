package com.stanzaliving.core.sqljpa.conveter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.stanzaliving.core.base.StanzaConstants;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Log4j2
public class DateTimestampDeserializser extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        if(StringUtils.isEmpty(jp.getText()))
            return null;
        String timestamp = jp.getText().trim();
        try {
            return new Date(TimeUnit.SECONDS.toMillis(Long.valueOf(timestamp)));
        } catch (NumberFormatException e) {
            log.warn("Unable to deserialize timestamp: {}" ,timestamp, e);
            return null;
        }
    }
}
