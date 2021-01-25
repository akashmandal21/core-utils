package com.stanzaliving.core.estate.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.estate.enums.EstateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstateCDCInfo {

    @JsonProperty("id")
    protected Long estateId;

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

    @JsonProperty("uuid")
    String estateUuid;

    @JsonProperty("estate_name")
    private String estateName;

    @JsonProperty("address_line_1")
    private String addressLine1;

    @JsonProperty("address_line_2")
    private String addressLine2;

    @JsonProperty("landmark")
    private String landmark;

    @JsonProperty("city")
    private String cityName;

    @JsonProperty("state")
    private String stateName;

    @JsonProperty("postal_code")
    private String postalCode;

    @JsonProperty("country")
    private String countryName;

    @JsonProperty("city_id")
    private Long cityId;

    @JsonProperty("micromarket_id")
    private Long micromarketId;

    @JsonProperty("lat")
    private Double lat;

    @JsonProperty("lon")
    private Double lon;

    @JsonProperty("estate_status")
    private EstateStatus estateStatus;

    @JsonProperty("estate_code")
    private String estateCode;
}
