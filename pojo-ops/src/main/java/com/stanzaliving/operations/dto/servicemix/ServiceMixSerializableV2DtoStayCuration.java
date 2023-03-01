package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.operations.enums.ServiceMixStatus;
import com.stanzaliving.operations.mongo.entity.servicemix.ServiceMixConfigV2StayCuration;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ServiceMixSerializableV2DtoStayCuration extends AbstractDto {

    private static final long serialVersionUID = 1L;

    private String residenceId;

    private String cityId;

    private String micromarketId;

    private String versionName;

    private String versionDisplayName;

    private Long version;

    private LocalDate fromDate;

    private ServiceMixConfigV2StayCuration serviceMixConfig;

    private String seasonUuid;

    private String seasonName;

    private LocalDate seasonFromDate;

    private LocalDate seasonToDate;

    private ServiceMixStatus serviceMixStatus;

    private String transformationChangeUuid;

    private boolean isDefault;

    private long residentOnBoardCount;

    private Date serviceMixApprovedOn;

    private ApprovalStatus approvalStatus;

    private String approvalPendingBy;

    private String dealDisplayName;

    private String dealUuid;

    private DealCategory dealCategory;

    private Map<String, String> tags;

    private boolean stayCuration;

}
