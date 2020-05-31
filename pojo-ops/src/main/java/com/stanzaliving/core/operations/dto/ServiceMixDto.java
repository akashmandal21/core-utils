package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;
import java.util.Map;

import com.stanzaliving.core.base.common.dto.AbstractDto;

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
	
	private String residenceId;
	
	private String cityId;

	private String microMarketId;
	
	private String versionName;
	
	private Long version;
	
	private LocalDate fromDate;
	
    private Map<String, Object> config;
	
}
