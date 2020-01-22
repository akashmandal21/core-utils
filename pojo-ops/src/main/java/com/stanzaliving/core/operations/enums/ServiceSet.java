/**
 * 
 */
package com.stanzaliving.core.operations.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 27-Dec-2019
 *
 **/
@Getter
public enum ServiceSet {

	FOOD_MEAL(1, "foodMeal", "Food - Meal"),
	FOOD_COMPOSITION(2, "foodComposition", "Food - Composition"),
	FOOD_CANTEEN(3, "foodCanteen", "Food - Canteen"),
	INTERNET(11, "internet", "Internet"),
	HOUSEKEEPING(21, "housekeeping", "Housekeeping"),
	LAUNDRY(31, "laundry", "Laundry"),
	ELECTRICITY(41, "electricty", "Electricity"),
	TRANSPORT(51, "transport", "Transport"),
	GYM(61, "gym", "Gym"),
	SECURITY(71, "security", "Security");

	private int order;

	private String serviceId;

	private String serviceName;

	private ServiceSet(int order, String serviceId, String serviceName) {
		this.order = order;
		this.serviceId = serviceId;
		this.serviceName = serviceName;
	}

	private static Map<String, ServiceSet> serviceSetMapById = new HashMap<>();

	static {

		for (ServiceSet serviceSet : ServiceSet.values()) {
			serviceSetMapById.put(serviceSet.getServiceId(), serviceSet);
		}

	}

	public static ServiceSet getServiceSetById(String serviceId) {
		return serviceSetMapById.get(serviceId);
	}
}