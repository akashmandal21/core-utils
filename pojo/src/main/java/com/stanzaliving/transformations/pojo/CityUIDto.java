package com.stanzaliving.transformations.pojo;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.location.GeoPointDto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CityUIDto implements Serializable {

	private static final long serialVersionUID = -5229262681044709946L;

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
	
	private String policeVerificationFormUrl;

}