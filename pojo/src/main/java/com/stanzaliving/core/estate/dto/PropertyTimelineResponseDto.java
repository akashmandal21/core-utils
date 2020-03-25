/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.commentsservice.dto.CommentsDto;
import com.stanzaliving.core.estate.enums.EstateStatus;

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
public class PropertyTimelineResponseDto {

	private String estateStatusDesc;
	private EstateStatus estateStatus;
	private Map<String, List<CommentsDto>> statusCommentsMap;
	private String updateBy;
	
}
