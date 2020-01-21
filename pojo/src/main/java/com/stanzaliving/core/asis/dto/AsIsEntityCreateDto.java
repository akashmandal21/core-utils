package com.stanzaliving.core.asis.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

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
public class AsIsEntityCreateDto implements Serializable {

	private static final long serialVersionUID = 113424124141489L;

	@NotBlank(message = "Estate uuid can't be empty.")
	private String estateUuid;
	
	@NotBlank(message = "Estate name can't be empty.")
	private String estateName;

	private String dueDate;

	private ContractorDto contractor;

	private String siteVisitDate;

	private String siteVisitStatus;

	@NotBlank(message = "PO Number can't be empty.")
	private String poNumber;

	private String poStatus;

	private String asIsStartsDate;

	private String asIsStatus;

}
