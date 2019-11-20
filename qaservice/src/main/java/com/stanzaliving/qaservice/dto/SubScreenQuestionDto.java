/**
 * 
 */
package com.stanzaliving.qaservice.dto;

import java.util.ArrayList;
import java.util.List;


import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class SubScreenQuestionDto {
	 List<QuestionResponseDto> questions = new ArrayList<>();
}
