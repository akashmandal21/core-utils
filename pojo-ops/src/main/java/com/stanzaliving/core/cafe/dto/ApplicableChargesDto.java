package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.cafe.enums.ChargeType;

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
public class ApplicableChargesDto extends AbstractDto{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ChargeType chargesType;
	
	private Double value;
	
	private Double gst;
	
	private boolean mandatory;
	
	
	
}
