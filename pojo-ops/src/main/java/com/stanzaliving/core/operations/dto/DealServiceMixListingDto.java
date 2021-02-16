package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.operations.enums.ServiceMixStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class DealServiceMixListingDto {
	
	private String uuid;
	private String versionName;
	private Long version;
	private LocalDate fromDate;
	private LocalDate toDate;
	private String createdBy;
	private ServiceMixStatus serviceMixStatus;
	private String dealUuid;
	private DealCategory dealCategory;
	private boolean isDefault;
	private Long residentOnBoardCount;
	
	private List<String> serviceList;
}
