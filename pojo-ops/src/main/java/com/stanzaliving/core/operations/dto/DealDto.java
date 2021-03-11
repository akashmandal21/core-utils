/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

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
	
	@NotNull(message = "Deal uiid is mandatory")
	private String uuid;

	@NotNull(message = "Deal name is mandatory")
	private String dealName;

	@NotNull(message = "DealType is mandatory")
	private DealType dealType;
	
	@Builder.Default
	private DealCategory dealCategory = DealCategory.B2B;

	@NotNull(message = "Deal status is mandatory")
	private DealStatus dealStatus;

	private boolean mgDeal;

	@Builder.Default
	private int mgCount = 0;
	
	private List<DealResidenceBedMappingDto> dealResidenceBedMappingDto;
	
	@NotNull(message = "Poc is mandatory")
	private Map<String, Object> pocConfig;

	@NotNull(message = "Deal startdate is mandatory")
	private LocalDate dealStartDate;

	@NotNull(message = "Deal enddate is mandatory")
	private LocalDate dealEndDate;

	@NotNull(message = "Deal created at venta date is mandatory")
	private LocalDate dealCreatedAtVenta;
	
	private Date dealApprovedDate;

	private String statementOfWorkDocumentUrl;

}