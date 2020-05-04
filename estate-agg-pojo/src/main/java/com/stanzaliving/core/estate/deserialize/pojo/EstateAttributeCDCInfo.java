package com.stanzaliving.core.estate.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstateAttributeCDCInfo {
    @JsonProperty("id")
    protected Long estateAttId;

    @JsonProperty("estate_id")
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
    String estateAttUuid;

    @JsonProperty("attribute_name")
    private String attributeName;

    @JsonProperty("attribute_value")
    private String attributeValue;

}
