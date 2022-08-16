package com.stanzaliving.internet.dto;

import com.stanzaliving.internet.enums.InternetVendor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class PropertyIdentifierDto {

	@NotBlank(message = "ResidenceId Cannot be blank")
	private String residenceId;

	@NotNull(message = "Vendor Selection is mandatory")
	private InternetVendor vendor;

	@NotBlank(message = "PropertyIdentifier Cannot be blank")
	private String propertyIdentifier;

	@NotBlank(message = "SiteId Cannot be blank")
	private String siteId;

}
