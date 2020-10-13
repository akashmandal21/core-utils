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
public class PropertyServiceMixEntityCDC {

    @JsonProperty("id")
    private Long serviceMixId;

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
    String serviceMixUuid;

    @JsonProperty("property_uuid")
    private String propertyUuid;

    @JsonProperty("service_mix_status")
    private String serviceMixStatus;

    @JsonProperty("current_version")
    private Integer version;

}
