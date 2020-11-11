package com.stanzaliving.complaint.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum EnumComplaintPriority {
	LOW(1, "Low"), MEDIUM(2, "Medium"), HIGH(3, "High"), URGENT(4, "Urgent");

	private Integer priorityId;
	private String priority;

	private static final Map<Integer, EnumComplaintPriority> byPriority = new HashMap<Integer, EnumComplaintPriority>();

	private static final Map<String, EnumComplaintPriority> byPriorityName = new HashMap<String, EnumComplaintPriority>();
	
	static {
		for (EnumComplaintPriority e : EnumComplaintPriority.values()) {
			byPriority.put(e.getPriorityId(), e);
			
			byPriorityName.put(e.getPriority(), e);
		}
	}

	public static EnumComplaintPriority getByPriorityId(Integer priorityId) {
		return byPriority.get(priorityId);
	}
	
	public static EnumComplaintPriority getByPriority(String priority) {
		
		return byPriorityName.get(priority);
	}

	private EnumComplaintPriority(Integer priorityId, String priority) {
		this.priorityId = priorityId;
		this.priority = priority;
	}

}
