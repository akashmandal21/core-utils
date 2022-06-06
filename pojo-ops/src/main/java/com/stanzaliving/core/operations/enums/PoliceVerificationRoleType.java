
package com.stanzaliving.core.operations.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PoliceVerificationRoleType {

	ZONAL_HEAD("Zonal Head", Department.OPS, AccessLevel.CITY),
	CITY_MANAGER("City Manager", Department.OPS, AccessLevel.CITY),
	CLUSTER_MANAGER("Cluster Manager", Department.OPS, AccessLevel.MICROMARKET),
	RESIDENT_CAPTAIN("Resident Captain", Department.OPS, AccessLevel.RESIDENCE);


	private String roleType;

	private Department department;

	private AccessLevel accessLevel;

}