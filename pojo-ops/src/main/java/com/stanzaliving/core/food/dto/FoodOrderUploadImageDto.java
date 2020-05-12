package com.stanzaliving.core.food.dto;

import java.util.List;

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
public class FoodOrderUploadImageDto {

	private String orderId;

	@NotEmpty(message = "upload image dto can not be empty")
	private List<UploadImageDto> imageDtos;

}
