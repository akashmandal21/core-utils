package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.RejectionType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
@Getter
@Setter
public class HotoRejectDto {
    private String rejectionType;
    private RejectionType rejectionDetails;
    private String assetId;
    private String cartUuid;
}
