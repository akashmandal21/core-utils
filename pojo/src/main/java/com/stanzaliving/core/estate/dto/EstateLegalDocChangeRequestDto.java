/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.estate.enums.EstateLegalDocumentType;

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
public class EstateLegalDocChangeRequestDto {

	private String estateUuid;
	private EstateLegalDocumentType documentType;
	private String reason;
}
