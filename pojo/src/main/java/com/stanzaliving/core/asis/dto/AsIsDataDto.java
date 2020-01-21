package com.stanzaliving.core.asis.dto;

import java.io.Serializable;
import java.util.List;

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

	private String estateUuid;
	
	private String estateName;

	private String dueDate;

	private ContractorDto contractor;

	private String siteVisitDate;

	private String siteVisitStatus;

	private String poNumber;

	private String poStatus;

	private String asIsStartsDate;

	private String asIsStatus;

	private List<AsIsDrawingsDto> asIsDrawings;

}
