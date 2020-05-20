package com.stanzaliving.core.estate.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.GenderAllowed;
import com.stanzaliving.transformations.enums.SubBrandName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeadershipEntity {

    @JsonProperty("id")
    protected Long leadershipId;

    @JsonProperty("created_at")
    protected Date createdAt;

    @JsonProperty("created_by")
    protected String createdBy;

    @JsonProperty("updated_at")
    protected Date updatedAt;

    @JsonProperty("updated_by")
    protected String updatedBy;

    @JsonProperty("status")
    protected boolean status = true;

    @JsonProperty("estate_uuid")
    String estateUuid;

    @JsonProperty("uuid")
    private String leadershipUuid;

    @JsonProperty("estate_code")
    private String estateCode;

    @JsonProperty( "estate_name")
    private String estateName;

    @JsonProperty("estate_id")
    private Long estateId;

    @JsonProperty( "property_name")
    private String propertyName;

    @JsonProperty( "brand_name")
    private BrandName brandName;

    @JsonProperty( "sub_brand_name")
    private SubBrandName subBrandName;

    @JsonProperty("gender_allowed")
    private GenderAllowed gender;

    @JsonProperty("micro_market_id")
    private Long micromarketId;

    @JsonProperty("city_id")
    private Long cityId;
}
