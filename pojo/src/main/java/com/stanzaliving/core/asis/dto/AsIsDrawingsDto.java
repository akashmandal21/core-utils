package com.stanzaliving.core.asis.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO to represent different attributes of AsIsDrawings.
 * 
 * @author debendra.dhinda
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AsIsDrawingsDto implements Serializable {

	private static final long serialVersionUID = 11424124141489L;

	private String asIsDrawingUuid;

	private String thumbnail;

	private String downloadUrl;

	private String actualSize;

	private String uploadedDate;

	private Boolean drawingStatus;

	private String asIsUuid;
	
}
