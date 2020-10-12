package com.stanzaliving.core.phoenix.embeddedinfos;

import com.stanzaliving.core.agg.commons.EnumDecoder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SfrInfo {

    private String sfrUuid;

    private String sfrStatus;

    private Date sfrCreatedAt;

    private Date sfrUpdatedAt;

    private String sfrCreatedBy;

    private String sfrUpdatedBy;

}
