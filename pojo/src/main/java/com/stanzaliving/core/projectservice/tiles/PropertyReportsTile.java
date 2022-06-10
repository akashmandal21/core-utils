package com.stanzaliving.core.projectservice.tiles;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Getter
public enum PropertyReportsTile {

    ATL("ATL", true, true, false, null, null, "",null),
    LLHODOC("LL HO Doc",false,true,false,null,null,"", Arrays.asList(PropertyUpdateEnum.LLHODOC_UPLOADED)),
    AS_IS("As-Is Report", true, true, true, Department.PROJECTS, PropertyUpdateEnum.PROJECT_AS_IS_COMPLETED, "asisdrawings",
            Arrays.asList(PropertyUpdateEnum.PROJECT_MANAGER_ASSIGNED,PropertyUpdateEnum.PROJECT_AS_IS_COMPLETED)),
    SFR("SFR", true, true, false, Department.PROJECTS, PropertyUpdateEnum.PROJECT_SFR_COMPLETED, "sfr-report",
            Arrays.asList(PropertyUpdateEnum.PROJECT_SITE_ENGINEER_ASSIGNED,PropertyUpdateEnum.PROJECT_SFR_COMPLETED)),
    //OFR("OFR",true,true),
    GC_SCHEDULE("GC Schedule", true, true, true, Department.GC, PropertyUpdateEnum.PROJECT_SITE_ENGINEER_ASSIGNED, "gc",
            Arrays.asList(PropertyUpdateEnum.PROJECT_SITE_ENGINEER_ASSIGNED,PropertyUpdateEnum.GC_SCHDULE_CREATED)),
    BED_COUNT_FINALIZATION("Bed Count Finalization", true, false, false, Department.DESIGN, PropertyUpdateEnum.DESIGN_BED_COUNT_FINALIZATION_COMPLETED, "bedcount",
            Arrays.asList(PropertyUpdateEnum.PROJECT_AS_IS_COMPLETED,PropertyUpdateEnum.DESIGN_BED_COUNT_FINALIZATION_COMPLETED)),
    GFC("GFC Drawings", true, true, false, Department.DESIGN, PropertyUpdateEnum.DESIGN_GFC_APPROVED, "gfcdrawings",
            Arrays.asList(PropertyUpdateEnum.DESIGN_BED_COUNT_FINALIZATION_COMPLETED,PropertyUpdateEnum.DESIGN_GFC_APPROVED)),
    BOQ("Master BOQ Formation", true, true, true, Department.DESIGN, PropertyUpdateEnum.DESIGN_BOQ_COMPLETED, "boq",
            Arrays.asList(PropertyUpdateEnum.DESIGN_BED_COUNT_FINALIZATION_COMPLETED,PropertyUpdateEnum.DESIGN_BOQ_COMPLETED)),
    PO("POs", true, true, true, Department.GC, PropertyUpdateEnum.CHECK_COMPLETED_FROM_SOURCE_SERVICE, "screen/po",null),
    GRN("GRN", true, true, true, Department.GC, PropertyUpdateEnum.CHECK_COMPLETED_FROM_SOURCE_SERVICE, "grn",null),
    HOTO("HOTO", true, true, false, Department.PROJECTS, PropertyUpdateEnum.PROJECTS_HOTO_GENERATED, "hoto",null),
    SERVICE_MIX("Service Mix", true, false, false, Department.DESIGN, PropertyUpdateEnum.SERVICE_MIX_COMPLETED, "servicemix",
            Arrays.asList(PropertyUpdateEnum.DESIGN_BED_COUNT_FINALIZATION_COMPLETED,PropertyUpdateEnum.SERVICE_MIX_COMPLETED)),
    PRODUCT_MIX("Product Mix", true, true, false, Department.DESIGN, null, "productmix",
            Collections.singletonList(PropertyUpdateEnum.DESIGN_BED_COUNT_FINALIZATION_COMPLETED));

    private String tileText;

    private boolean visibleToDesign;

    private boolean visibleToProjects;

    private boolean visibleToGc;

    private Department department;

    private PropertyUpdateEnum completedStatus;

    private String link;

    private List<PropertyUpdateEnum> preRequired;

}
