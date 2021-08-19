package com.stanzaliving.core.base.pair;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.apache.commons.lang3.tuple.Pair;

import java.io.IOException;

public class PairStdDeSerializer extends JsonDeserializer<Pair<Object, Object>> {

	private static final long serialVersionUID = 1L;

	@Override
	public Pair<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
		final Object[] array = jsonParser.readValueAs(Object[].class);
		return Pair.of(array[0], array[1]);
	}
}
