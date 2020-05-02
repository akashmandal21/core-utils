package com.stanzaliving.core.projectservice.tiles;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PropertyReportsTile {

    ATL("ATL", true, true, false, null, null, ""),
    AS_IS("As-Is Report", true, true, true, Department.PROJECTS, PropertyUpdateEnum.PROJECT_AS_IS_COMPLETED, "asisdrawings"),
    SFR("SFR", true, true, false, Department.PROJECTS, PropertyUpdateEnum.PROJECT_SFR_COMPLETED, "sfr-report"),
    //OFR("OFR",true,true),
    GC_SCHEDULE("GC Schedule", true, true, true, Department.GC, PropertyUpdateEnum.PROJECT_SITE_ENGINEER_ASSIGNED, "gc"),
    BED_COUNT_FINALIZATION("Bed Count Finalization", true, false, false, Department.DESIGN, PropertyUpdateEnum.DESIGN_BED_COUNT_FINALIZATION_COMPLETED, "bedcount"),
    GFC("GFC Drawings", true, true, false, Department.DESIGN, PropertyUpdateEnum.DESIGN_GFC_APPROVED, "gfcdrawings"),
    BOQ("Master BOQ Formation", true, true, true, Department.DESIGN, PropertyUpdateEnum.DESIGN_BOQ_COMPLETED, "boq"),
    PO("POs", true, true, true, null, PropertyUpdateEnum.CHECK_COMPLETED_FROM_SOURCE_SERVICE, "pos"),
    GRN("GRN", true, true, true, null, PropertyUpdateEnum.CHECK_COMPLETED_FROM_SOURCE_SERVICE, "grn"),
    HOTO("HOTO", true, true, false, Department.PROJECTS, PropertyUpdateEnum.PROJECTS_HOTO_GENERATED, "hoto");

    private String tileText;

    private boolean visibleToDesign;

    private boolean visibleToProjects;

    private boolean visibleToGc;

    private Department department;

    private PropertyUpdateEnum completedStatus;

    private String link;

}
