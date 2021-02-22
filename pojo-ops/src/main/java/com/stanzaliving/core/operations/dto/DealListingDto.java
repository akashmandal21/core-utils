package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.core.operations.enums.DealStatus;
import com.stanzaliving.core.operations.enums.DealType;

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
public class DealListingDto {
	
	private String uuid;
	private String residenceUuid;
	private String dealName;
	private DealType dealType;
	private DealStatus dealStatus;
	private DealCategory dealCategory;
	
	private boolean mgDeal;
	
	@Builder.Default
	private int bedCount = 0;

	private String pocName;
	private String pocContact;
	private String pocEmail;
	private LocalDate fromDate;
	private LocalDate toDate;
	private Date dealCreatedOn;
	private Date dealApprovedOn;
	private LocalDate dealCreatedAtVenta;
	private String statementOfWorkDocumentUrl;

	@Builder.Default
	private Integer approvedServiceMixCount = 0;

	@Builder.Default
	private Integer residentOnBoardCount = 0;
	
	List<DealServiceMixListingDto> serviceMixDtoList;
	
}
