/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import java.util.Date;
import java.util.List;

import com.stanzaliving.core.commentsservice.dto.CommentsDto;
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
	private String estateStatus;
	private List<CommentsDto> comments;
	private String updateBy;
	private Date updateTime;
	private String colorCode;
	
}
