package com.stanzaliving.wanda.venta.response;

import java.util.Map;

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
public class PackageServiceDto {

	private String[] values;
	private PackageServiceNameDto icon;
	private String key;
	private Map<String, Object> properties;
}
