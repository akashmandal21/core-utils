package com.stanzaliving.core.operations.dto.serviceset;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.AccessLevel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ServiceMixDto extends AbstractDto {

	private AccessLevel accessLevel;

	private String cityId;

	private String cityName;

	private String microMarketId;

	private String microMarketName;

	private String residenceId;

	private String residenceName;

	@Min(value = 0, message = "Version Cannot be negative")
	private int version;

	@NotNull(message = "Service Config cannot be null")
	private OpsServicesDto servicesDto;
}