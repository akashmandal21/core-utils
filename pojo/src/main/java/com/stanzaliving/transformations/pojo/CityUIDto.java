package com.stanzaliving.transformations.pojo;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.location.GeoPointDto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CityUIDto {

	@NotBlank(message = "City UUID is Mandatory")
	private String uuid;

	private long id;

	@NotBlank(message = "City Name is Mandatory")
	private String cityName;

	private long stateId;

	@NotNull
	private String stateName;

	@NotNull
	private GeoPointDto location;

	private List<GeoPointDto> polygonPoints;

	private Boolean status;

	private String cityCode;

	@NotNull(message = "City Number of Beds is Mandatory")
	@Min(value = 1, message = "Number of Beds cannot be less than 1")
	private Integer targetBeds;

	@NotNull(message = "City Number of Rooms is Mandatory")
	@Min(value = 1, message = "Number of Rooms cannot be less than 1")
	private Integer targetRooms;


	private String zoneUuid;

	private String zoneName;

}