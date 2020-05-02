package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.gcservice.enums.GcScheduleStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GCScheduleStatusCDC {
    @JsonProperty("id")
    private Long gcSchedStatusId;

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
    String gcSchedStatusUuid;

    @JsonProperty("property_uuid")
    private String propertyUuid;

    @JsonProperty("schedule_status")
    private GcScheduleStatus gcScheduleStatus;

    @JsonProperty("file_path")
    private String filePath;

    @JsonProperty("file_version")
    private Integer fileVersion;

    @JsonProperty("city")
    private String city;

    @JsonProperty("city_uuid")
    private Long cityId;

    @JsonProperty("micromarket_id")
    private Long micromarketId;

    @JsonProperty("micromarket_name")
    private String micromarketName;

    @JsonProperty("house_name")
    private String houseName;
}
