package com.stanzaliving.core.utility.dto;

import javax.validation.constraints.Min;

import com.stanzaliving.core.base.common.dto.AbstractDto;

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
public class ExpenseDetailsDto extends AbstractDto {

	private static final long serialVersionUID = 6932231353406396251L;

	private Integer capacity;
	
	@Min(value = 0, message = "Rate Cannot Be Less Than Zero")
	private Double rate;
	
	@Min(value = 0, message = "Quantity Cannot Be Less Than Zero")
	private Double quantity;
	
	private Double amount;
}
