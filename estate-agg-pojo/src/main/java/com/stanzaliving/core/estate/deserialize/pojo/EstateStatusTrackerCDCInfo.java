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
public class EstateStatusTrackerCDCInfo {

    @JsonProperty("id")
    protected Long id;

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
    String statusTrackerUuid;

    @JsonProperty("context_name")
    private String contextName;

    @JsonProperty("context_uuid")
    private String estateUuid;

    @JsonProperty("status_name")
    private String estateStatus;
}
