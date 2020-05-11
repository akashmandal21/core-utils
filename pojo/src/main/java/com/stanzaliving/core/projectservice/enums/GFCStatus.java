package com.stanzaliving.core.projectservice.enums;

import com.stanzaliving.core.base.enums.ColorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum GFCStatus {

    NOT_STARTED("Not Available","#e5e3e3",0, ColorCode.BLACK.getColorCode()),
    IN_DRAFT("In Draft","#e5e3e3",1,ColorCode.BLACK.getColorCode()),
    SENT_FOR_APPROVAL_TO_ZH("Uploaded","#FFC300",2,ColorCode.BLACK.getColorCode()),
    SENT_FOR_APPROVAL_TO_NH("Approved by Zonal Head","#FFC300",3,ColorCode.GREEN.getColorCode()),
    SENT_BACK_BY_ZH("Sent Back by Zonal Head","#e5e3e3",1,ColorCode.RED.getColorCode()),
    SENT_BACK_BY_NH("Sent Back by National Head","#e5e3e3",1,ColorCode.RED.getColorCode()),
    APPROVED("Approved","#77baa6",4,ColorCode.GREEN.getColorCode());

    private String status;
    private String color;
    private Integer stageOrder;
    private String stageColor;

    private static EnumMap<GFCStatus, String> gfcStatus = new EnumMap<>(GFCStatus.class);

    static {
        gfcStatus.put(NOT_STARTED,NOT_STARTED.getStatus());
        gfcStatus.put(IN_DRAFT, IN_DRAFT.getStatus());
        gfcStatus.put(SENT_FOR_APPROVAL_TO_ZH, SENT_FOR_APPROVAL_TO_ZH.getStatus());
        gfcStatus.put(SENT_FOR_APPROVAL_TO_NH, SENT_FOR_APPROVAL_TO_NH.getStatus());
        gfcStatus.put(SENT_BACK_BY_ZH, SENT_BACK_BY_ZH.getStatus());
        gfcStatus.put(SENT_BACK_BY_NH, SENT_BACK_BY_NH.getStatus());
        gfcStatus.put(APPROVED, APPROVED.getStatus());
    }

    public static Map<GFCStatus, String> getAll() {
        return gfcStatus;
    }

    public static List<GFCStatus> getAllAboveStage(int order){
        return Arrays.stream(GFCStatus.values()).filter(f->f.getStageOrder()>order).collect(Collectors.toList());
    }

}
