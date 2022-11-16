package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.residenceservice.enums.VasCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Builder
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = { "serviceId" })
public class ResidenceServiceDtoV2 {
	private String serviceName;
	private Boolean optional;
	private Double price;
	@Builder.Default
	private Double cgst = 0.0;
	@Builder.Default
	private Double sgst = 0.0;
	@Builder.Default
	private Double igst = 0.0;
	private boolean enabled;
	private String serviceId;
	private String serviceImage;
	private String description;
	private String serviceDisclaimer;
	private String shortText;
	private String bgColor;
	private Double totalAmount;
	private VasCategory vasCategory;
	private PackageServiceDto packagedServices;
}