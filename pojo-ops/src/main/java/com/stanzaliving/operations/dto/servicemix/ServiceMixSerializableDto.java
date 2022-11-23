package com.stanzaliving.operations.dto.servicemix;

import java.time.LocalDate;
import java.util.Map;

import com.stanzaliving.core.operations.enums.DealCategory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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

	private String dealUuid;

	private DealCategory dealCategory;

	private Config config = new Config();

	private Map<String, String> tags;
}
