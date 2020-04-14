package com.stanzaliving.core.estate.agg.entity;

import com.stanzaliving.core.estate.enums.EstateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstateInfo {
    @Indexed(unique = true)
    protected Long estateId;


    protected Date createdAt;

    protected String createdBy;

    protected Date updatedAt;

    protected String updatedBy;

    protected boolean status = true;

    @Indexed(unique = true)
    String estateUuid;

    @TextIndexed
    private String estateName;

    @Indexed
    private Long cityId;

    @Indexed
    private Long micromarketId;

    private Double lat;

    private Double lon;

    @Indexed
    private EstateStatus estateStatus;

    private String estateCode;

    private Address address;

    private String city;

    private String micromarket;

}
