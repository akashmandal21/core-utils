package com.stanzaliving.core.food.dto.response;

import java.util.List;

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
public class VasResidentOrderDto {

	private String residentId;

	private String residentName;

	private List<VasItemOrderDto> vasItemOrderDtos;

	private Double amountPayable;

	private Double amountPaid;

	private String mode;
}
