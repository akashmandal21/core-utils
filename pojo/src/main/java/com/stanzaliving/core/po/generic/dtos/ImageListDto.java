package com.stanzaliving.core.po.generic.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageListDto {

	private String imageSrc;
	private ImageData imageData;
}
