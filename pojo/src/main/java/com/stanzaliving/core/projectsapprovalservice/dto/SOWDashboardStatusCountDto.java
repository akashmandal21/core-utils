package com.stanzaliving.core.projectsapprovalservice.dto;

import com.stanzaliving.core.estate.enums.SOWDashboardStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SOWDashboardStatusCountDto {

	private SOWDashboardStatus status;

	private String name;

	private Integer count;

	private Double percentage;

	private String color;

	public SOWDashboardStatusCountDto(SOWDashboardStatus status, int count) {

		this.status = status;
		this.count = count;
	}
}
