package com.stanzaliving.wanda.venta.response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(of = {"serviceId"})
public class ResidenceServiceDto {
	private String serviceName;
    private Boolean optional;
    private Double price;
    private Boolean enabled;
    private Integer serviceId;
    private String serviceImage;
    private String description;
    private String serviceDisclaimer;
    private String bgColor;
}