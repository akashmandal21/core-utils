/**
 * 
 */
package com.stanzaliving.qaservice.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class QuestionDataDto {

	private String estateId;
	private String propertyId;
	private List<ScreenQuestionDto> screenQuestionList = new ArrayList<>();
	private Map<String, Object> answers;
	private Date lastUpdatedAt;
	
	public QuestionDataDto(String estateId) {
		this.estateId = estateId;
	}
}
