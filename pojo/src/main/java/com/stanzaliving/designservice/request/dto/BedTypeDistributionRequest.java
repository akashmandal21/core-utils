package com.stanzaliving.designservice.request.dto;

import java.util.List;

import com.stanzaliving.designservice.enums.BedType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BedTypeDistributionRequest {

	private int totalBeds;
	private BedType bedType;
	private List<BedRoomDistribution> bedRoomDistribution;
	private String designFilePath;
	private String cadFilePath;
}
