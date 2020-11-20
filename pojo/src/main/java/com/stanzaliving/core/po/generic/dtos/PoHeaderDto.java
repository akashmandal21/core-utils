package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import lombok.*;

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
    private GenericPOType poType;
    private String propertyUuid;

    //Flags

    @Builder.Default
    private boolean showShortCloseButton;

    @Builder.Default
    private boolean showCancelButton;

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
}
