package com.stanzaliving.transformations.pojo;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.location.GeoPointDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class MicroMarketUIDto implements Serializable {

	private static final long serialVersionUID = -8278477851223241472L;

	private long id;

	private String uuid;

	@NotBlank(message = "Micro Market Name is Mandatory")
	private String microMarketName;

	private String cityUuid;

	private Long cityId;

	@NotBlank(message = "Micro Market City Name is Mandatory")
	private String cityName;

	@NotNull
	private GeoPointDto location;

	private List<GeoPointDto> polygonPoints;

	private Boolean status;

	private String microMarketCode;

	@NotNull(message = "Micro Market Number of Beds is Mandatory")
	@Min(value = 1, message = "Number of Beds cannot be less than 1")
	private Integer targetBeds;

	@NotNull(message = "Micro Market Number of Rooms is Mandatory")
	@Min(value = 1, message = "Number of Rooms cannot be less than 1")
	private Integer targetRooms;
}