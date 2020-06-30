package com.stanzaliving.operations.dto.servicemix;

import java.time.LocalDate;

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
public class ServiceMixSerializableDto {
	private String uuid;
	
	private String residenceId;
	private String residenceName;
	
	private String cityId;
	private String cityName;
	
	private String micromarketId;
	private String micromarketName;
	
	private String versionName;
	
	private Long version;
	
	private LocalDate fromDate;
	
	private boolean scheduled;
	
    private Config config;
    
}
