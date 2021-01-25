package com.stanzaliving.core.projectservice.enums;

import lombok.Getter;

@Getter
public enum  ProjectSummaryStatus {

    PRE_HANDOVER("Pre Handover","#faf7d8"), //Till Phase 2
    PRE_LAUNCH("Pre Launch","#efcfdd"), //From Phase 3 to Till Phase 5
    SL_OPERATED("SL Operated","#d0f6e6"); //After Phase 5

    private String statusDesc;
    private String colorCode;

    ProjectSummaryStatus(String statusDesc, String colorCode){
        this.statusDesc = statusDesc;
        this.colorCode = colorCode;
    }

}
