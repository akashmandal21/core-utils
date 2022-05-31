package com.stanzaliving.sfr.enumeration;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ModuleNames {

    SFR,
    SFR_SUBMISSION,
    ASIS,
    ASIS_SUBMISSION;

    public static final List<ModuleNames> moduleNames = Arrays.asList(ASIS, SFR);

    public static final List<ModuleNames> moduleSubmissionNames = Arrays.asList(SFR_SUBMISSION, ASIS_SUBMISSION);

}
