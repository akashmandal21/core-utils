/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.pojo.AttachmentDto;

import lombok.Builder;
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
@Builder
public class AtlFileRequestDto {

	private String estateUuid;
	private AttachmentDto attachmentDto;
}
