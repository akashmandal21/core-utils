package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.RejectionType;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
@Getter
@Setter
@SuperBuilder
public class AssetBaseDetails {
    private String qrUrl;
    private String assetUuid;
    private String qrCodeId;
    private String assetCode;
    private String rejectionReason;
    private RejectionType rejectionType;
}
