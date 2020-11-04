package com.stanzaliving.core.cafe.dto;

import java.time.LocalTime;
import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.cafe.enums.SlotType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SlotsDto extends AbstractDto{

	private static final long serialVersionUID = 1L;
	
	private String cafeId;

	private String residenceId ;
	
	private String slotName;
	
	private SlotType slotType;
	
	private LocalTime deliveryTime;

	private LocalTime orderingWindowStartTime;

	private LocalTime orderingWindowEndTime;

	private List<ApplicableChargesDto> applicableCharges;
	

}
