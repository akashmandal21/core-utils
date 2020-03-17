/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import com.stanzaliving.designservice.enums.BedType;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class BedTypeImagePathDto {

	private BedType bedType;
	private String filePath;
	private String fileName;
}
