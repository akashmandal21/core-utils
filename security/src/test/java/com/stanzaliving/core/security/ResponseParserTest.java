/**
 * 
 */
package com.stanzaliving.core.security;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Objects;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.user.dto.UserDto;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
 **/
public class ResponseParserTest {

	@Test
	public void testResponseParsing() throws JsonParseException, JsonMappingException, IOException {

		String response =
				"{\"status\":true,\"message\":\"Found User for User Id\",\"id\":null,\"errorCode\":null,\"data\":{\"id\":null,\"uuid\":\"8ccf7a69-2751-4201-a6ed-597be5c8afe5\",\"createdAt\":1571994818000,\"createdBy\":null,\"updatedAt\":1571994872000,\"updatedBy\":null,\"status\":true,\"isoCode\":\"IN\",\"mobile\":\"9716554117\",\"mobileVerified\":true,\"email\":\"navuniverse@gmail.com\",\"emailVerified\":false,\"userType\":\"STUDENT\"},\"httpStatusCode\":0}";

		ObjectMapper objectMapper = new ObjectMapper();

		ResponseDto<UserDto> responseDto = objectMapper.readValue(response, new TypeReference<ResponseDto<UserDto>>() {
		});

		assertTrue(Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData()));

	}
}