package com.stanzaliving.wanda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class BudgetDemographicsResponseDto {

	private String eventDescription;

	private String eventUUid;

	private String specialEventType;

	private List<BudgetDemographicsData> demographicsDataList;

	private List<String> demographicsNameList;


}
