package com.stanzaliving.core.phoenix.embeddedinfos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceMixInfo {

    private String serviceMixUuid;

    private String serviceMixStatus;

    private Integer serviceMixVersion;

    private Date serviceMixCreatedAt;

    private Date serviceMixUpdatedAt;

    private String serviceMixCreatedBy;

    private String serviceMixUpdatedBy;

}
