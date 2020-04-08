package com.stanzaliving.core.estate.agg.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class EstateStatusStruct {
    String updatedBy;
    Date updatedAt;
}
