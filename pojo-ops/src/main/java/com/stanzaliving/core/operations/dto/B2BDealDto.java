/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.operations.enums.B2BDealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
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
public class B2BDealDto {

	@NotBlank(message = "B2BDeal UUID is Mandatory")
	private String uuid;

	@NotBlank(message = "ResidenceId is mandatory")
	private String residenceUuid;
	
	@NotBlank(message = "B2BDeal Name is mandatory")
	private String b2bDealName;

	@NotBlank(message = "B2BDeal Type is mandatory")
	private B2BDealType b2bDealType;

	@NotBlank(message = "MGStatus is mandatory")
	private boolean mgStatus;

	private Integer bedCount;
	
	@Builder.Default
	private Integer mgCount = 0;

	private String b2bPoc;

	private LocalDate b2bDealFromDate;

	private LocalDate b2bDealToDate;

	private LocalDate b2bDealCreatedOn;

	private LocalDate b2bDealApprovedOn;

	private String statementOfWorkDocumentUrl;

	@Builder.Default
	private Integer approvedServiceMixcount = 0;
	
	@Builder.Default
	private Integer residentOnBoardCount = 0;

}