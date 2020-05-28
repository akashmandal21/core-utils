package com.stanzaliving.core.food.dto.response;

import java.awt.image.BufferedImage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FoodQrResponseDto {

	String path;
	
	Object data;
}
