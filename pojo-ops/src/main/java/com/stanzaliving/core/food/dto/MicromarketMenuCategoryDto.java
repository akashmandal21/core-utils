package com.stanzaliving.core.food.dto;

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
public class MicromarketMenuCategoryDto {

	private String micromarketName;

	private List<String> fbManagerNames;

	private List<String> fbManagerContactNos;

	private List<VendorEmailDto> vendorEmailDtos;
}
