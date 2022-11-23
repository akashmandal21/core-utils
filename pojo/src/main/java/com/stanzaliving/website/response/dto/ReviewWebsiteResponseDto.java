package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ReviewWebsiteResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String residentName;

	private String residentImage;
	
	private String reviewText;
	
	private Date reviewDate;
	
	private Integer position;
}
