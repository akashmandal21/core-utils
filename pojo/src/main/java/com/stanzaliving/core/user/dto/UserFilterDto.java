package com.stanzaliving.core.user.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.user.enums.UserType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
public class UserFilterDto {
	private List<String> userIds;

	private String name;

	private String mobile;

	private String isoCode;

	private String email;

	private UserType userType;

	private Boolean status;

	private Department department;

	private PaginationRequest pageRequest;
}
