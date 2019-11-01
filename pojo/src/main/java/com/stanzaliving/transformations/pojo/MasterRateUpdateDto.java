package com.stanzaliving.transformations.pojo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MasterRateUpdateDto {

	private String masterBOIId;

	private List<Long> cityIds;

	private Double monthlyRentRate;

	private Double buyRate;

}