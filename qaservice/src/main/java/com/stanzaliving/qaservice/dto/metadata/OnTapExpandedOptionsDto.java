/**
 * 
 */
package com.stanzaliving.qaservice.dto.metadata;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.qaservice.dto.QuestionResponseDto;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class OnTapExpandedOptionsDto {
	String id;
	String heading;
	String imageUrl;
	String subHeading;
	List<QuestionResponseDto> questions = new ArrayList<>();

	public OnTapExpandedOptionsDto(String heading, String imageUrl) {
	        this.heading = heading;
	        this.imageUrl = imageUrl;
	}

	public OnTapExpandedOptionsDto(String id, String heading, String imageUrl, String subHeading) {
		this.id = id;
		this.heading = heading;
		this.imageUrl = imageUrl;
		this.subHeading = subHeading;
	}
}
