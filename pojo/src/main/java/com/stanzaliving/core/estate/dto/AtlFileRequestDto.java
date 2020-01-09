/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.pojo.AttachmentDto;

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
public class AtlFileRequestDto {

	private String estateId;
	private AttachmentDto attachmentDto;
}
