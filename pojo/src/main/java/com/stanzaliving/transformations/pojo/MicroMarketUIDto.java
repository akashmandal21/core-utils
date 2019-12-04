package com.stanzaliving.transformations.pojo;

import java.util.List;

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
public class MicroMarketUIDto {

	private String uuid;

	private long id;

	@NotNull
	private String microMarketName;

	private Long cityId;

	@NotNull
	private String cityName;

	@NotNull
	private GeoPointDto location;

	private List<GeoPointDto> polygonPoints;

	private Boolean status;
	
	private String microMarketCode;
	
	private Integer targetBeds;
	
	private Integer targetRooms;
}