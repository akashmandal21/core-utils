package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import com.stanzaliving.core.po.generic.enums.PoDownloadEnum;
import lombok.*;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PoHeaderDto {

    private String poToUuid;
    private String poToNumber;
    private boolean isPo;
    private GenericPOTOStatus potoStatus;
    private Department poDepartment;
    private String potoStatusText;
    private String textColor;
    private String backgroundColor;
    private GenericPOType poType;
    private String propertyUuid;
    private long minPoEndDate;

    //Flags

    @Builder.Default
    private boolean showShortCloseButton=false;

    @Builder.Default
    private boolean showCancelButton=false;

    @Builder.Default
    private boolean showDeleteButton = false;

    @Builder.Default
    private boolean canSendPoToVendor = false;
    @Builder.Default
    private boolean grnCompleted = false;
    @Builder.Default
    private boolean grnStarted = false;
    @Builder.Default
    private boolean grnInstallAllowed = false;
    @Builder.Default
    private boolean grnRcvAllowed = false;
    @Builder.Default
    private boolean advanceAllowed = false;
    @Builder.Default
    private boolean regularInvoiceAllowed = false;
    @Builder.Default
    private boolean scRequest = false;
    @Builder.Default
    private boolean cancelRequest = false;

    @Builder.Default
    private boolean canExtend = false;

    private Map<PoDownloadEnum,Boolean> downloadActions;
}
