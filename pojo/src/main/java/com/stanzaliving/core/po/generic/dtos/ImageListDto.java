package com.stanzaliving.core.po.generic.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImageListDto {

	private String imageSrc;
	private ImageData imageData;
}
