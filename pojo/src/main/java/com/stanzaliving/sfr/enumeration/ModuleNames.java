package com.stanzaliving.sfr.enumeration;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ModuleNames {

    SFR(true, "Site Feasibility Report", "Site Feasibility Report"),
    SFR_SUBMISSION(false, "SFR Submission", "Site Feasibility Report"),
    ASIS(false, "As-Is Drawings", "As-Is Drawings"),
    ASIS_SUBMISSION(true, "AsIs Submission", "As-Is Drawings"),
    BOQ(false, "BOQ", "Bill Of Quantities");

    private final boolean isQuestionTemplateIdRequired;

    private final String name;

    private final String displayName;

    public static final List<ModuleNames> moduleNames = Arrays.asList(ASIS, BOQ);//add SFR also in this moduleNames list

    public static final List<ModuleNames> moduleSubmissionNames = Arrays.asList(SFR_SUBMISSION, ASIS_SUBMISSION);

}
