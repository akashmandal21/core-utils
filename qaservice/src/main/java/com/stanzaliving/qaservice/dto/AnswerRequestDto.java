/**
 * 
 */
package com.stanzaliving.qaservice.dto;

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
public class AnswerRequestDto {

	private String estateId;
	private String propertyId; 
	private Map<String, Object> answerMap;
}
