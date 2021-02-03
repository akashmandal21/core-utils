package com.stanzaliving.core.opscalculator.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ServiceMixListingResponseDto implements Cloneable {
    String versionName;
    Long versionNumber;
    LocalDate fromDate;
    String uuid;
    String seasonUuid;
    @Builder.Default
    Boolean selected = false;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
