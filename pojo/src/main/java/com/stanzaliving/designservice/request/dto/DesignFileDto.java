/**
 * 
 */
package com.stanzaliving.designservice.request.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DesignFileDto {

	private String designFileUuid;
	private String filePath;
	private String fileName;
}
