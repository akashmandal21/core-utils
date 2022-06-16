package com.stanzaliving.sfr.enumeration;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ModuleNames {

    SFR(true, "Site Feasibility Report"),
    SFR_SUBMISSION(false, "SFR Submission"),
    ASIS(false, "As-Is Drawings"),
    ASIS_SUBMISSION(true, "AsIs Submission");

    private final boolean isQuestionTemplateIdRequired;

    private final String name;

    public static final List<ModuleNames> moduleNames = Arrays.asList(ASIS, SFR);

    public static final List<ModuleNames> moduleSubmissionNames = Arrays.asList(SFR_SUBMISSION, ASIS_SUBMISSION);

}
