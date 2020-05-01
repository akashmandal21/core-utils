package com.stanzaliving.core.projectservice.enums;

import java.util.EnumMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BedCountStatus {

	NOT_STARTED("Not Started","#e5e3e3"),
	IN_DRAFT("In draft","#e5e3e3"),
	SUBMITTED("Submitted","#e5e3e3"),
	ZONAL_HEAD("Zonal Head","#e5e3e3"),
	SENT_BACK_BY_ZONAL_HEAD("Sent back by zonal head","#e5e3e3"),
	DESIGN_HEAD("Design head","#e5e3e3"),
	SENT_BACK_BY_DESIGN_HEAD("Sent back by design head","#e5e3e3"),
	TRANSFORMATIONS("Sent For Approval","#e5e3e3"),
	APPROVED_BY_TRANSFORMATIONS("Approved By Transformations","#e5e3e3"),
	SENT_BACK_BY_TRANSFORMATIONS("Sent Back By Transformations","#e5e3e3"),
	LEADERSHIP("Leadership","#e5e3e3"),
	SENT_BACK_BY_LEADERSHIP("sent back by leadership","#e5e3e3");

	private String status;
	private String color;

	private static EnumMap<BedCountStatus, String> bedCountStatusMap = new EnumMap<>(BedCountStatus.class);

	static {
		bedCountStatusMap.put(NOT_STARTED,BedCountStatus.NOT_STARTED.getStatus());
		bedCountStatusMap.put(IN_DRAFT, BedCountStatus.IN_DRAFT.getStatus());
		bedCountStatusMap.put(SUBMITTED, BedCountStatus.SUBMITTED.getStatus());

		bedCountStatusMap.put(ZONAL_HEAD, BedCountStatus.ZONAL_HEAD.getStatus());
		bedCountStatusMap.put(SENT_BACK_BY_ZONAL_HEAD, BedCountStatus.SENT_BACK_BY_ZONAL_HEAD.getStatus());
		
		bedCountStatusMap.put(DESIGN_HEAD, BedCountStatus.DESIGN_HEAD.getStatus());
		bedCountStatusMap.put(SENT_BACK_BY_DESIGN_HEAD, BedCountStatus.SENT_BACK_BY_DESIGN_HEAD.getStatus());
		bedCountStatusMap.put(TRANSFORMATIONS, BedCountStatus.TRANSFORMATIONS.getStatus());
		
		bedCountStatusMap.put(SENT_BACK_BY_TRANSFORMATIONS, BedCountStatus.SENT_BACK_BY_TRANSFORMATIONS.getStatus());
		bedCountStatusMap.put(LEADERSHIP, BedCountStatus.LEADERSHIP.getStatus());
		bedCountStatusMap.put(SENT_BACK_BY_LEADERSHIP, BedCountStatus.SENT_BACK_BY_LEADERSHIP.getStatus());
	}

	public static Map<BedCountStatus, String> getAll() {
		return bedCountStatusMap;
	}
}
