package com.stanzaliving.core.security.policeverification.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PVRoleType {

    RESIDENT_CAPTAIN("Resident Captain", Department.OPS, AccessLevel.RESIDENCE),

    NODAL_TEAM("Nodal Team", Department.LEGAL, AccessLevel.MICROMARKET),

    COUNTRY_KYC_DOCUMENTS_APPROVAL("COUNTRY_KYC_DOCUMENTS_APPROVAL", Department.LEGAL, AccessLevel.COUNTRY),

    SIGMA_PV_CITY_VIEW("SIGMA_PV_CITY_VIEW", Department.OPS, AccessLevel.CITY),

    SIGMA_PV_MICROMARKET_VIEW("SIGMA_PV_MICROMARKET_VIEW", Department.OPS, AccessLevel.MICROMARKET),

    SIGMA_PV_COUNTRY_VIEW("SIGMA_PV_COUNTRY_VIEW", Department.OPS, AccessLevel.COUNTRY);

    private final String roleType;

    private final Department department;

    private final AccessLevel accessLevel;
}
