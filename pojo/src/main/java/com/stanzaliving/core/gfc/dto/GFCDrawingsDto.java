package com.stanzaliving.core.gfc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.gfc.enums.GFCCategories;

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
public class GFCDrawingsDto implements Serializable {

	private static final long serialVersionUID = 113424124141489L;

	@NotBlank(message = "Property uuid can't be empty.")
	private String propertyUuid;
	
	@NotBlank
	private GFCCategories gfcCategories;
	

}
