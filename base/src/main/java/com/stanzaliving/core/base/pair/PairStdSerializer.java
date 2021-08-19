package com.stanzaliving.core.base.pair;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang3.tuple.Pair;

import java.io.IOException;

public class PairStdSerializer extends JsonSerializer<Pair<Object, Object>> {

	private static final long serialVersionUID = 1L;

	@Override
	public void serialize(
			Pair pair,
			JsonGenerator jsonGenerator,
			SerializerProvider serializerProvider) throws IOException {
		jsonGenerator.writeStartArray(2);
		jsonGenerator.writeObject(pair.getLeft());
		jsonGenerator.writeObject(pair.getRight());
		jsonGenerator.writeEndArray();
	}
}
