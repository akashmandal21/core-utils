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
    BOQ(false, "BOQ", "Bill Of Quantities"),
    CONCEPT_DRAWINGS(false, "Concept Drawings", "Concept Drawings"),
    CONCEPT_SUBMISSION(true, "Concept Drawings Submission", "Concept Drawings"),
    HOTO(false, "Handover to Operations", "HOTO"),
    HOTO_SUBMISSION(true, "HOTO Submission", "HOTO"),
    LL_HO(true, "Land Lord Hand Over", "Land Lord Hand Over");
    private final boolean isQuestionTemplateIdRequired;

    private final String name;

    private final String displayName;


    public static final List<ModuleNames> moduleNames = Arrays.asList(ASIS, BOQ, SFR, CONCEPT_DRAWINGS,HOTO);//add SFR also in this moduleNames list

    public static final List<ModuleNames> moduleSubmissionNames = Arrays.asList(SFR_SUBMISSION, ASIS_SUBMISSION, CONCEPT_SUBMISSION, HOTO_SUBMISSION);


}
