/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.far.enums;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableSet;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum RoleAction {

	SIGMA_MANAGE_ASSETS(0, "SIGMA_MANAGE_ASSETS", ImmutableSet.of("SIGMA_MANAGE_ASSETS")),
	ASSET_DISCARD(1, "ASSET_DISCARD", ImmutableSet.of("ASSET_DISCARD")),
	ASSET_RETURN(2, "ASSET_RETURN", ImmutableSet.of("ASSET_RETURN")),
	REPLACE_QR_CODE(3, "REPLACE_QR_CODE", ImmutableSet.of("REPLACE_QR_CODE")),
	AUDIT_ASSET(4, "AUDIT_ASSET", ImmutableSet.of("AUDIT_ASSET")),
	ASSET_HOTO(5, "ASSET_HOTO", ImmutableSet.of("ASSET_HOTO")),
	TRANSFER_IN_ASSET(6, "TRANSFER_IN_ASSET", ImmutableSet.of("TRANSFER_IN_ASSET")),
	TRANSFER_OUT_ASSET(7, "TRANSFER_OUT_ASSET", ImmutableSet.of("TRANSFER_OUT_ASSET")),
	MULTI_TO_SINGLE_ASSET(8, "MULTI_TO_SINGLE_ASSET", ImmutableSet.of("ADD_NEW_ASSET")),
	SCHEDULED_ACTIVITIES(8, "SCHEDULED_ACTIVITIES", ImmutableSet.of("SCHEDULED_ACTIVITIES")),
	VIEW_ASSET_DETAILS(9, "VIEW_ASSET_DETAILS", ImmutableSet.of("FAR_VIEW", "VIEW_ASSET_DETAILS", "SIGMA_MANAGE_ASSETS")),
	ADD_NEW_ASSET(10, "ADD_NEW_ASSET", ImmutableSet.of("ADD_NEW_ASSET")),
	VIEW_ASSET_HISTORY(11, "VIEW_ASSET_HISTORY", ImmutableSet.of("FAR_VIEW", "VIEW_ASSET_DETAILS", "SIGMA_MANAGE_ASSETS")),
	ADD_COMMENTS(12, "ADD_COMMENTS", ImmutableSet.of("ADD_NEW_ASSET")),
	EDIT_ASSET_DETAILS(13, "EDIT_ASSET_DETAILS", ImmutableSet.of("ADD_NEW_ASSET"));

	private final int sequenceId;
	private final String actionName;
	private final Set<String> roles;

	private static final Map<RoleAction, Set<String>> roleActionMap = new HashMap<>();
	private static final Set<String> farRolesSet = new HashSet<>();

	static {
		Arrays.stream(RoleAction.values()).forEach(f -> {
			roleActionMap.put(f, f.getRoles());
			farRolesSet.addAll(f.getRoles());
		});
	}

	public static Set<RoleAction> getActionMappedToRole(String role) {
		HashSet<RoleAction> roleActions = new HashSet<RoleAction>();

		for (Map.Entry<RoleAction, Set<String>> entry : roleActionMap.entrySet()) {
			if (entry.getValue().contains(role)) {
				roleActions.add(entry.getKey());
			}
		}

		return roleActions;
	}

	public static Set<RoleAction> getActionMappedToRoles(Collection<String> roles) {
		HashSet<RoleAction> roleActions = new HashSet<RoleAction>();

		roles.stream().forEach(role -> roleActions.addAll(getActionMappedToRole(role)));

		return roleActions;
	}

	public static Set<String> getActionNamesMappedToRoles(Collection<String> roles) {
		Set<RoleAction> roleActions = new HashSet<RoleAction>();

		roles.stream().forEach(role -> roleActions.addAll(getActionMappedToRole(role)));

		return roleActions.stream()
				.sorted(Comparator.comparingInt(RoleAction::getSequenceId))
				.map(RoleAction::getActionName)
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}

	public static Set<String>  getAllFarRoles() {
		return farRolesSet;
//		Set<String> allFarRoles = new HashSet<>();
//
//		for (Map.Entry<RoleAction, Set<String>> entry : roleActionMap.entrySet()) {
//			Set<String> roles = entry.getValue();
//			for (String role : roles) {
//				allFarRoles.add(role);
//			}
//		}
//		return allFarRoles;
	}


}
