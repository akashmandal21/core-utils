package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.stanzaliving.core.agg.deserializers.TimestampDeserializser;
import com.stanzaliving.core.projectservice.enums.GFCStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GFCEntityCDC {

    @JsonProperty("id")
    private Long gfcId;

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
    String gfcUuid;

    @JsonProperty("property_uuid")
    private String propertyUuid;

    @JsonProperty("scheduled_due_date")
    @JsonDeserialize(using = TimestampDeserializser.class)
    private LocalDate scheduledDueDate;

    @JsonProperty("gfc_status")
    private GFCStatus gfcStatus;

    @JsonProperty("due_date")
    @JsonDeserialize(using = TimestampDeserializser.class)
    private LocalDate dueDate;

    @JsonProperty("version")
    private Integer version;
}
