package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
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
public class PackageServiceNameDto {

	private int id;
	private String serviceName;
	private String uuid;
	private String lable;
	private String serviceImage;
	private String priorityOrder;
	private String sortDescription;
	private String serviceDisclaimer;
	private boolean status;
}
