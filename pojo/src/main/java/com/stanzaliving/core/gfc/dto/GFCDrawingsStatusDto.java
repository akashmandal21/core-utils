package com.stanzaliving.core.gfc.dto;

import java.io.Serializable;

import com.stanzaliving.core.gfc.enums.GFCDrawingsStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO to represent GFCDrawings status data.
 * 
 * @author debendra.dhinda
 * @since 29-Jan-2020
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GFCDrawingsStatusDto implements Serializable {

	private static final long serialVersionUID = 113424124141489L;
	
	private String statusName;
	private String statusColor;
	private GFCDrawingsStatus status;

}
