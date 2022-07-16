package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Getter
@AllArgsConstructor
public enum PoliceVerificationStatus {

    FORM_GENERATION("Form Generation", 1,"#7A7D7E", TeamType.S, Arrays.asList(PVApplicable.ONLINE, PVApplicable.OFFLINE, PVApplicable.EXCEL), "PDF Form shared by system to nodal team"),

    FORM_SUBMISSION("Form Submission",  2,"#4E5253", TeamType.N, Arrays.asList(PVApplicable.ONLINE, PVApplicable.OFFLINE), "Submitted PDF form with RC for resident photograph and signature"),

    FORM_UPDATION("Form Updation", 3,"#FAB432", TeamType.RC, Collections.singletonList(PVApplicable.OFFLINE),"Resident photograph and signature updated on form"),

    UPDATED_FORM_SUBMISSION("Updated Form Submission", 4,"#B48241", TeamType.RC, Collections.singletonList(PVApplicable.OFFLINE), "Submitted Updated form with Nodal team"),

    FORM_SUBMISSION_TO_POLICE("Form Submission to Police", 5, "#F591AA", TeamType.N, Arrays.asList(PVApplicable.OFFLINE, PVApplicable.EXCEL), "Submitted Form in Police station for verification"),

    STAMPED_FORM_SUBMISSION("Stamped Form Submission", 6, "#5F11D7", TeamType.N, Arrays.asList(PVApplicable.ONLINE, PVApplicable.OFFLINE, PVApplicable.FRRO, PVApplicable.EXCEL),"Submitted Stamped form with RC"),

    STAMPED_FORM_UPLOAD("Stamped Form Upload",7, "#5FC4F5", TeamType.RC, Arrays.asList(PVApplicable.ONLINE, PVApplicable.OFFLINE, PVApplicable.FRRO, PVApplicable.EXCEL),"Uploaded stamped Police Verification Form"),

    LEGAL_VERIFICATION_PENDING("Legal Verification Pending", 8, "#297BFF", TeamType.L, Arrays.asList(PVApplicable.ONLINE, PVApplicable.OFFLINE, PVApplicable.FRRO, PVApplicable.EXCEL),"Legal Verification Pending"),

    LEGAL_VERIFIED("Legal Verified", 9, "#60C3AD", TeamType.L, Arrays.asList(PVApplicable.ONLINE, PVApplicable.OFFLINE, PVApplicable.FRRO, PVApplicable.EXCEL),"Form verified by legal team"),

    LEGAL_REJECTED("Legal Rejected", 10, "#F55F71", TeamType.L, Arrays.asList(PVApplicable.ONLINE, PVApplicable.OFFLINE, PVApplicable.FRRO, PVApplicable.EXCEL), "Form Rejected by legal Team");

    private final String name;
    private final int sequence;
    private final String colorCode;
    private final TeamType teamType;
    private final List<PVApplicable> pvApplicableList;
    private final String description;

}
