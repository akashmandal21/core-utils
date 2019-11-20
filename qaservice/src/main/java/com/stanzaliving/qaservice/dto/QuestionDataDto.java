/**
 * 
 */
package com.stanzaliving.qaservice.dto;

import java.util.ArrayList;
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

	String estateId;
	List<ScreenQuestionDto> screenQuestionList = new ArrayList<>();
	Map<String, Object> answers;
	
	public QuestionDataDto(String estateId) {
		this.estateId = estateId;
	}
}
