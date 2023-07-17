package com.stanzaliving.core.user.request.dto;

import java.util.List;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.user.enums.UserType;

import lombok.Data;

@Data
public class UserRequestDto {

	private Integer pageNo;
	private Integer limit;
	private Boolean status;
	private UserType userType;
	private Department department;
	private String isoCode;
	private String mobile;
	private List<String> userIds;
	private String email;
	private String name;

}