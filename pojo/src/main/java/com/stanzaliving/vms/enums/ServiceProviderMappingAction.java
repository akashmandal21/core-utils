package com.stanzaliving.vms.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ServiceProviderMappingAction {

	ADD("Add", 1), 
	UPDATE("Update", 2), 
	DELETE("Delete", 3);

	private String actionName;
	private Integer actionId;

	private static final List<EnumListing<ServiceProviderMappingAction>> enumListing = new ArrayList<>();
	private static Map<String, ServiceProviderMappingAction> actionIdTypeMap = new HashMap<>();

	static {
		for (ServiceProviderMappingAction actionType : ServiceProviderMappingAction.values()) {
			enumListing.add(EnumListing.of(actionType, actionType.getActionName()));
			actionIdTypeMap.put(actionType.getActionName(), actionType);
		}
	}

	public static ServiceProviderMappingAction getServiceProviderMappingActionType(String type) {
		return actionIdTypeMap.get(type);
	}

	public static List<EnumListing<ServiceProviderMappingAction>> getServiceProviderMappingActionTypeListing() {
		return enumListing;
	}

}
