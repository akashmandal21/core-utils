/**
 * 
 */
package com.stanzaliving.qaservice.dto;

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
	List<ScreenQuestionListDto> screenQuestionList;
	Map<String, Object> answers;
	
	public QuestionDataDto(String estateId) {
		this.estateId = estateId;
	}
}
