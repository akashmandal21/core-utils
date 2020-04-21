package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

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
public class VendorItemDetailRequestDto {

	@NotBlank(message = "Vendor Id Cannot be blank")
	private String vendorId;

	@NotBlank(message = "Residence Id Cannot be blank")
	private String residenceId;

	@NotEmpty(message = "Item Detail Cannot be empty")
	private List<ItemDetailRequestDto> itemDetailRequestDtos;

}
