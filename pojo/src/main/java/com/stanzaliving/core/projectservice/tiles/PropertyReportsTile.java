package com.stanzaliving.core.projectservice.tiles;


import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;



@AllArgsConstructor
@Getter
public enum PropertyReportsTile {

    SFR("SFR",true,true,false,Department.PROJECTS,PropertyUpdateEnum.PROJECT_SFR_COMPLETED,"sfr-report"),
    //OFR("OFR",true,true),
    AS_IS("As-Is Report",true,true,true,Department.PROJECTS,PropertyUpdateEnum.PROJECT_AS_IS_COMPLETED,"asisdrawings"),
    GFC("GFC Drawings",true,true,false,Department.DESIGN,PropertyUpdateEnum.DESIGN_GFC_APPROVED,"gfcdrawings"),
    BOQ("Master BOQ Formation",true,true,true,Department.DESIGN,PropertyUpdateEnum.DESIGN_BOQ_COMPLETED,"boq"),
    ATL("ATL",true,true,false,null,null,""),
    BED_COUNT_FINALIZATION("Bed Count Finalization",true,false,false,Department.DESIGN,PropertyUpdateEnum.DESIGN_BED_COUNT_FINALIZATION_COMPLETED,"bedcount"),
    GC_SCHEDULE("GC Schedule",true,true,true,Department.GC,PropertyUpdateEnum.PROJECT_SITE_ENGINEER_ASSIGNED,"gc"),
    HOTO("Hoto",true,true,false,Department.PROJECTS,PropertyUpdateEnum.PROJECTS_HOTO_GENERATED,"hoto"),
    PO("PO",false,false,true,null,null,"po");
    private String tileText;
    private boolean visibleToDesign;
    private boolean visibleToProjects;
    private boolean visibleToGc;
    private Department department;
    private PropertyUpdateEnum completedStatus;
    private String link;
}
