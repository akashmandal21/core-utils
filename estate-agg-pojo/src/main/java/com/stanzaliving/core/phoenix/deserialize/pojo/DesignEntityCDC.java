package com.stanzaliving.core.phoenix.deserialize.pojo;

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
public class DesignEntityCDC {
    @JsonProperty("id")
    private Long designId;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("updated_at")
    private Date updatedAt;

    @JsonProperty("updated_by")
    private String updatedBy;

    @JsonProperty("status")
    private boolean status = true;

    @JsonProperty("uuid")
    String designUuid;

    @JsonProperty( "property_uuid")
    private String propertyUuid;

    @JsonProperty("zonal_head_uuid")
    private String zonalHeadUuid;

    @JsonProperty("design_coordinator_uuid")
    private String designCoordinatorUuid;
}
