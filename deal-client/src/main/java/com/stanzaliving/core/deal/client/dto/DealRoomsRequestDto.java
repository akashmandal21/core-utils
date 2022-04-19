package com.stanzaliving.core.deal.client.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.deal.client.enums.DealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DealRoomsRequestDto {
	
	@NotNull(message="dealUuid cannot be null")
	private String dealUuid;
	
	@NotNull(message="residenceUuid cannot be null")
	private String residenceUuid;
	
	@NotNull(message="dealType cannot be null")
	private DealType dealType;
	
	private List<Integer> occupancy;
	
	private List<Integer> floor;
	
	private String searchString;

	private Date moveInDate;

	private Date dealEndDate;

}
