/**
 * 
 */
package com.stanzaliving.qaservice.dto;

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
public class ScreenQuestionListDto {

	String name;
	String heading;
	List<SubScreenQuestionList> subScreenQuestionList;
	
}
