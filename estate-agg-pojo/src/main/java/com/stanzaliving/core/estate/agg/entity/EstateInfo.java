package com.stanzaliving.core.estate.agg.entity;

import com.stanzaliving.core.estate.enums.EstateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstateInfo {
    protected Long estateId;

    protected Date createdAt;

    protected String createdBy;

    protected Date updatedAt;

    protected String updatedBy;

    protected boolean status = true;

    String estateUuid;

    private String estateName;

    private Long cityId;

    private Long micromarketId;

    private Double lat;

    private Double lon;

    private EstateStatus estateStatus;

    private String estateCode;

    private Address address;

    private String city;

    private String micromarket;

}
