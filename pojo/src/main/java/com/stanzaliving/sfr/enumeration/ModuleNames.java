package com.stanzaliving.sfr.enumeration;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ModuleNames {

    SFR(true),
    SFR_SUBMISSION(false),
    ASIS(false),
    ASIS_SUBMISSION(true);

    private final boolean isQuestionTemplateIdRequired;

    public static final List<ModuleNames> moduleNames = Arrays.asList(ASIS, SFR);

    public static final List<ModuleNames> moduleSubmissionNames = Arrays.asList(SFR_SUBMISSION, ASIS_SUBMISSION);

}
