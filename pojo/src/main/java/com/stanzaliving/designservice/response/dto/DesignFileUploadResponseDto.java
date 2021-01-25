/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DesignFileUploadResponseDto {

	private String estateUuid;
	private String designFilePath;
	private String designFileUuid;
}
