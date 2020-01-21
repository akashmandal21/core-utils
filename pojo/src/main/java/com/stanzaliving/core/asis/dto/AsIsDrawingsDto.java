package com.stanzaliving.core.asis.dto;

import java.io.Serializable;
import java.util.Date;

import com.stanzaliving.core.base.common.dto.AbstractDto;

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
public class AsIsDrawingsDto extends AbstractDto implements Serializable {

	private static final long serialVersionUID = 11424124141489L;

	private String thumbnail;

	private String downloadUrl;

	private long actualSize;

	private Date uploadedDate;

	private String drawingStatus;

	private String asIsUuid;
}
