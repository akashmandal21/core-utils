package com.stanzaliving.internet.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class S3FileUploadDTO {
	
	@NotBlank(message = "bucket cannot be blank")
	private String bucket;
	
	@NotBlank(message = "file No cannot be blank")
	private String file;

	
}
