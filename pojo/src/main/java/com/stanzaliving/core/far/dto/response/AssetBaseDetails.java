package com.stanzaliving.core.far.dto.response;

import lombok.Getter;
import lombok.Setter;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
@Getter
@Setter
public class AssetBaseDetails {
    private String qrUrl;
    private String assetUuid;
    private String assetCode;
    private String rejectionReason;

}
