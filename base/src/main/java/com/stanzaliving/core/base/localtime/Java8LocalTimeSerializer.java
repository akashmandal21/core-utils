/**
 * 
 */
package com.stanzaliving.core.base.localtime;

import java.io.IOException;
import java.time.LocalTime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * 
 * @author naveen
 *
 * @date 27-Dec-2019
 */
public class Java8LocalTimeSerializer extends StdSerializer<LocalTime> {

	private static final long serialVersionUID = 1L;

	public Java8LocalTimeSerializer() {
		super(LocalTime.class);
	}

	@Override
	public void serialize(LocalTime value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeObject(value.toString());
	}

}