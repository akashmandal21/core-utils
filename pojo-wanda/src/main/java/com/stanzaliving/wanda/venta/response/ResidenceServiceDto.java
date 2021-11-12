package com.stanzaliving.wanda.venta.response;

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
public class ResidenceServiceDto {
	private String serviceName;
    private Boolean optional;
    private Double price;
    private Boolean enabled;
    private Integer serviceId;
    private String serviceImage;
    private String description;
    private String serviceDisclaimer;
    private String shortText;
    private String bgColor;

}