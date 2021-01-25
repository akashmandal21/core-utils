package com.stanzaliving.core.asis.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Contractor DTO represents different attributes of contractor used in as-is drawings.
 * 
 * @author debendra.dhinda
 * */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContractorDto implements Serializable{

	private static final long serialVersionUID = 11424124141489L;
	
	private String companyName;
	private String name;
	private String mobile;
	private String officePhone;
	
}
