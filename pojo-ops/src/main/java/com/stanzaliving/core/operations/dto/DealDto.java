/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

/**
 * @author manish.pareek
 *
 * @date 05-Feb-2021
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DealDto {

	private String uuid;

	private String dealName;

	private DealType dealType;
	
	@Builder.Default
	private DealCategory dealCategory = DealCategory.B2B;

	private DealStatus dealStatus;

	private boolean mgDeal;

	@Builder.Default
	private Integer mgCount = 0;
	
	private List<DealResidenceBedMappingDto> dealResidenceBedMappingDto;

	private String pocName;

	private String pocContact;

	private String pocEmail;

	private LocalDate dealStartDate;

	private LocalDate dealEndDate;

	private LocalDate dealCreatedAtVenta;

	private String statementOfWorkDocumentUrl;

}