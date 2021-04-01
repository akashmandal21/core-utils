/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ServiceMixReminderDto {

	private String cityId;

	private String cityName;

	private String microMarketId;

	private String microMarketName;

	private String residenceId;

	private String residenceName;

	private String sessionStartDate;

}

