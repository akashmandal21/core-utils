package com.stanzaliving.website.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WebsiteResumeDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "name is a mandatory field")
	private String name;

	private String mobileNumber;

	private String email;

	private String profileLinks;

	private String resumeLink;

	private String source;

	private String description;

	private String requestReceivedOn;
}
