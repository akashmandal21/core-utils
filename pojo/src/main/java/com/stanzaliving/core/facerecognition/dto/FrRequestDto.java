package com.stanzaliving.core.facerecognition.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@NoArgsConstructor
@SuperBuilder
public class FrRequestDto {

	@NotBlank(message = "Bucket name is mandatory")
	private String bucket;

	@NotBlank(message = "Image Path is mandatory")
	private String path;

}