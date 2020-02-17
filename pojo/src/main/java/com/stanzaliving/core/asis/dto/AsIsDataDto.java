package com.stanzaliving.core.asis.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.asis.enums.POStatus;
import com.stanzaliving.core.asis.enums.SiteVisitStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO to represent AsIsDrawigns data.
 * 
 * @author debendra.dhinda
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AsIsDataDto extends AbstractDto implements Serializable {

	private static final long serialVersionUID = 113424124141489L;

	private String propertyUuid;

	private String dueDate;
	
	private String delayReason;

	private ContractorDto contractor;

	private String siteVisitDate;

	private String siteVisitStatus;
	
	private SiteVisitStatus siteVisitStatusKey;

	private String poNumber;

	private String poStatus;
	private POStatus poStatusKey;
	
	private String asIsStartsDate;

	private String asIsStatus;
	private String asIsStatusText;
	private String lastUpdatedAt;
	
	private boolean asIsMarkedComplted;
	private List<AsIsDrawingsDto> asIsDrawings;

}
