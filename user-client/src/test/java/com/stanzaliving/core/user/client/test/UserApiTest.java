/**
 * 
 */
package com.stanzaliving.core.user.client.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdDeserializer;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdSerializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeDeserializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeSerializer;
import com.stanzaliving.core.user.dto.UserProfileDto;

/**
 * @author naveen.kumar
 *
 * @date 20-Jun-2020
 *
 **/
public class UserApiTest {

	private ObjectMapper mapper;

	@Before
	public void init() {
		mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);

		SimpleModule module = new SimpleModule();
		module.addSerializer(new Java8LocalDateStdSerializer());
		module.addDeserializer(LocalDate.class, new Java8LocalDateStdDeserializer());

		module.addSerializer(new Java8LocalTimeSerializer());
		module.addDeserializer(LocalTime.class, new Java8LocalTimeDeserializer());

		mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.registerModule(module);

	}

	@Test
	public void testParseToTypeReference() throws JsonParseException, JsonMappingException, IOException {

		String json =
				"{\"status\":true,\"message\":\"Found User for User Id\",\"id\":null,\"errorCode\":null,\"data\":{\"id\":null,\"uuid\":\"ff56219e-52f4-4ae1-9e19-fc72cc3cc059\",\"createdAt\":1589556576000,\"createdBy\":null,\"updatedAt\":1589711609000,\"updatedBy\":null,\"status\":true,\"isoCode\":\"IN\",\"mobile\":\"9716554117\",\"mobileVerified\":true,\"email\":\"naveen.kumar@stanzaliving.com\",\"emailVerified\":false,\"userType\":\"TECH\",\"department\":\"OPS\",\"departmentName\":\"Operations\",\"firstName\":\"Naveen\",\"lastName\":\"Kumar\",\"middleName\":\"\",\"secondaryEmail\":null,\"secondaryEmailVerified\":false,\"secondaryIsoCode\":null,\"secondaryMobile\":null,\"secondaryMobileVerified\":false,\"gender\":null,\"profilePicture\":null,\"birthday\":null,\"maritalStatus\":null,\"anniversaryDate\":null,\"address\":null},\"httpStatusCode\":0}";

		TypeReference<ResponseDto<UserProfileDto>> returnType = new TypeReference<ResponseDto<UserProfileDto>>() {
		};

		ResponseDto<UserProfileDto> responseDto = mapper.readValue(json, returnType);

		System.out.println(responseDto);

		assertNotNull(responseDto);
		assertTrue(responseDto.isStatus());
	}
}