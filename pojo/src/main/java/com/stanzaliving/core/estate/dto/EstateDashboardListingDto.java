package com.stanzaliving.core.estate.dto;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.estate.enums.BDDashboardStatus;
import com.stanzaliving.core.user.dto.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EstateDashboardListingDto extends EstateDto {

	private LocalDate handoverDate;

	private Address address;

	private List<String> imageUrls;

	private EstateAppAttributes estateAttributes;

	private String estateCode;
	
	private String estateStatusStr;
	
	private BDDashboardStatus bdDashboardStatus;
	
	private String bdDashboardStatusStr;
	
	private String createdByName;
	
	private String createdByNumber;
	
	private String managerName;
}