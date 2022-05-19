package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum PoliceVerificationStatus {

    FORM_GENERATION("Form Generation", 1,"#140505", TeamType.S, "PDF Form shared by system to nodal team"),

    FORM_SUBMISSION("Form Submission",  2,"#8C1919", TeamType.N, "Submitted PDF form with RC for resident photograph and signature"),

    FORM_UPDATION("Form Updation", 3,"#251515", TeamType.RC, "Resident photograph and signature updated on form"),

    UPDATED_FORM_SUBMISSION("Updated Form Submission", 4,"#1C1515", TeamType.RC, "Submitted Updated form with Nodal team"),

    FORM_SUBMISSION_TO_POLICE("Form Submission to Police", 5, "#1B2631", TeamType.N, "Submitted Form in Police station for verification"),

    STAMPED_FORM_SUBMISSION("Stamped Form Submission", 6, "#212F3C", TeamType.N, "Submitted Stamped form with RC"),

    STAMPED_FORM_UPLOAD("Stamped Form Upload",7, "#6C3483", TeamType.RC, "Uploaded stamped Police Verification Form"),

    LEGAL_VERIFICATION("Legal Verification", 8, "#BB8FCE", TeamType.L, "Legal Verification Pending"),

    LEGAL_VERIFIED("Legal Verified", 9, "#C0392B", TeamType.L, "Form verified by legal team"),

    LEGAL_REJECTED("Legal Rejected", 10, "#DFFF00", TeamType.L, "Form Rejected by legal Team");

    private final String name;
    private final int sequence;
    private final String colorCode;
    private final TeamType teamType;
    private final String description;

}
