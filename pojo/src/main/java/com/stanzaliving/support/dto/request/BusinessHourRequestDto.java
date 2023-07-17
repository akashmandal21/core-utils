package com.stanzaliving.support.dto.request;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.enums.AccessLevel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessHourRequestDto {

	@NotNull(message = "groupUuid can't be left blank.")
	private String groupUuid;
	@NotEmpty(message = "primary reference uuid can't be left blank.")
	private List<String> primaryReferenceUuid;
	@NotNull(message = "accessLevelUuid can't be left blank.")
	private String accessLevelUuid;
	@NotNull(message = "accessLevel can't be left blank.")
	private AccessLevel accessLevel;
}
