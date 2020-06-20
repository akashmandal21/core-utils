/**
 * 
 */
package com.stanzaliving.core.user.client.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.BaseMapperConfig;
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
		mapper = BaseMapperConfig.getDefaultMapper();
	}

	@Test
	public void testParseToTypeReference() throws JsonParseException, JsonMappingException, IOException {

		String json =
				"{\"status\":true,\"message\":\"Found User for User Id\",\"id\":null,\"errorCode\":null,\"data\":{\"id\":null,\"uuid\":\"ff56219e-52f4-4ae1-9e19-fc72cc3cc059\",\"createdAt\":1589556576000,\"createdBy\":null,\"updatedAt\":1589711609000,\"updatedBy\":null,\"status\":true,\"isoCode\":\"IN\",\"mobile\":\"9716554117\",\"mobileVerified\":true,\"email\":\"naveen.kumar@stanzaliving.com\",\"emailVerified\":false,\"userType\":\"TECH\",\"department\":\"OPS\",\"departmentName\":\"Operations\",\"firstName\":\"Naveen\",\"lastName\":\"Kumar\",\"middleName\":\"\",\"secondaryEmail\":null,\"secondaryEmailVerified\":false,\"secondaryIsoCode\":null,\"secondaryMobile\":null,\"secondaryMobileVerified\":false,\"gender\":null,\"profilePicture\":null,\"birthday\":null,\"maritalStatus\":null,\"anniversaryDate\":null,\"address\":null},\"httpStatusCode\":0}";

		TypeReference<ResponseDto<UserProfileDto>> returnType = new TypeReference<ResponseDto<UserProfileDto>>() {
		};

		ResponseDto<UserProfileDto> responseDto = mapper.readValue(json, returnType);

		assertNotNull(responseDto);
		assertTrue(responseDto.isStatus());
	}
}