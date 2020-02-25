package com.stanzaliving.core.projectservice.tiles;


import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.projectservice.enums.PropertyUpdateEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;



@AllArgsConstructor
@Getter
public enum PropertyReportsTile {

    SFR("SFR",true,true,Department.PROJECTS,PropertyUpdateEnum.PROJECT_SFR_COMPLETED,"sfr-report"),
    //OFR("OFR",true,true),
    AS_IS("As-Is Report",true,true,Department.PROJECTS,PropertyUpdateEnum.PROJECT_AS_IS_COMPLETED,"asisdrawings"),
    GFC("GFC Drawings",true,true,Department.DESIGN,PropertyUpdateEnum.DESIGN_GFC_APPROVED,"gfcdrawings"),
    BOQ("Master BOQ Formation",true,true,Department.DESIGN,PropertyUpdateEnum.DESIGN_BOQ_COMPLETED,"boq"),
    ATL("ATL",true,true,null,null,""),
    BED_COUNT_FINALIZATION("Bed Count Finalization",true,false,Department.DESIGN,PropertyUpdateEnum.DESIGN_BED_COUNT_FINALIZATION_COMPLETED,"bedcount");


    private String tileText;
    private boolean visibleToDesign;
    private boolean visibleToProjects;
    private Department department;
    private PropertyUpdateEnum completedStatus;
    private String link;
}
