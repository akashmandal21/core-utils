/**
 * 
 */
package com.stanzaliving.core.pojo;

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
public class AttachmentDto {

	private String bucket;	
	private String filePath;
	private String fileName;
	private String disposition;
	private String type;
}
