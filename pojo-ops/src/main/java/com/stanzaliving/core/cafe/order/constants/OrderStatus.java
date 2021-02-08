package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@AllArgsConstructor
public enum OrderStatus {

	CREATED("Created", "order.created"),
	PLACED("Placed", "order.placed"),
	CONFIRMED("Confirmed", "order.confirmed"),
	PREPARING("Preparing", "order.preparing"),
	PREPARED("Prepared", "order.prepared"),
	PACKED("Packed", "order.packed"),
	DISPATCHED("Dispatched", "order.dispatched"),
	DELIVERED("Delivered", "order.delivered"),
	RECEIVED("Received", "order.received"),
	CANCELLED("Cancelled", "order.cancelled");

	private final String status;
	private final String event;

	private static final List<EnumListing<OrderStatus>> enumListing = new ArrayList<>();

	static {
		for (OrderStatus curOption : OrderStatus.values()) {
			EnumListing<OrderStatus> listing = EnumListing.of(curOption, curOption.getStatus());
			enumListing.add(listing);
		}
	}

	public static List<EnumListing<OrderStatus>> getEnumListing() {
		return enumListing;
	}

	public static OrderStatus fromEvent(String eventType) {
		if (StringUtils.isEmpty(eventType)) {
			return null;
		}

		for (OrderStatus curStatus : OrderStatus.values()) {
			if (curStatus.getEvent().equalsIgnoreCase(eventType)) {
				return curStatus;
			}
		}

		return null;
	}

	public static Set<OrderStatus> newConfirmedOrderStatuses() {
		Set<OrderStatus> statuses = new HashSet<>();
		statuses.add(PLACED);
		statuses.add(CONFIRMED);
		statuses.add(PREPARING);
		return statuses;
	}

	public static boolean isNewConfirmedOrder(OrderStatus orderStatus) {
		return newConfirmedOrderStatuses().contains(orderStatus);
	}

	public static List<OrderStatus> pendingStatus() {
		List<OrderStatus> statuses = new ArrayList<>();
		statuses.add(PLACED);
		statuses.add(CONFIRMED);
		statuses.add(PREPARING);
		statuses.add(PREPARED);
		statuses.add(PACKED);
		statuses.add(DISPATCHED);
		return statuses;
	}

	public static List<OrderStatus> allEligibleOrderStatus() {
		List<OrderStatus> statuses = new ArrayList<>();
		statuses.add(PLACED);
		statuses.add(CONFIRMED);
		statuses.add(PREPARING);
		statuses.add(PREPARED);
		statuses.add(PACKED);
		statuses.add(DISPATCHED);
		statuses.add(RECEIVED);
		statuses.add(DELIVERED);
		return statuses;
	}

	public static List<OrderStatus> allEligibleOrderStatusWithCancelled() {
		List<OrderStatus> statuses = allEligibleOrderStatus();
		statuses.add(CANCELLED);
		return statuses;
	}

	public static boolean isPending(OrderStatus status) {
		return pendingStatus().contains(status);
	}

	public static List<OrderStatus> getDispatchOrderStatus() {
		List<OrderStatus> orderStatuses = new ArrayList<>();
		orderStatuses.add(OrderStatus.DISPATCHED);
		orderStatuses.add(OrderStatus.RECEIVED);
		return orderStatuses;
	}

	public static List<OrderStatus> getDispatchWithDeliveredOrderStatus() {
		List<OrderStatus> orderStatuses = getDispatchOrderStatus();
		orderStatuses.add(DELIVERED);
		return orderStatuses;
	}

	public static boolean isPacked(OrderStatus orderStatus) {
		List<OrderStatus> packedStatus = new ArrayList<>();
		packedStatus.add(PREPARED);
		packedStatus.add(PACKED);
		packedStatus.add(DISPATCHED);
		packedStatus.add(RECEIVED);
		packedStatus.add(DELIVERED);
		return packedStatus.contains(orderStatus);
	}
}