/**
 * 
 */
package com.stanzaliving.qaservice.dto;

import java.util.ArrayList;
import java.util.List;

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
public class ScreenQuestionDto {

	String name;
	String heading;
	List<QuestionResponseDto> attachedQuestions = new ArrayList<>();
	List<SubScreenQuestionDto> subScreenQuestionList = new ArrayList<>();
	
}
