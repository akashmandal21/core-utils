package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.stanzaliving.core.agg.deserializers.TimestampDeserializser;
import com.stanzaliving.core.base.enums.Department;
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
public class GCScheduleCDC {

    @JsonProperty("id")
    private Long gcSchedId;

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
    String gcSchedUuid;

    @JsonProperty("step_number")
    private Integer stepNumber;

    @JsonProperty("step_name")
    private String stepName;

    @JsonProperty("sub_step_number")
    private Integer subStepNumber;

    @JsonProperty("sub_step_name")
    private String subStepName;

    @JsonProperty("dependent_step_number")
    private Integer dependentStep;

    @JsonProperty("dependent_sub_step_number")
    private Integer dependentSubStep;

    @JsonProperty("department")
    private Department department;

    @JsonProperty("assigned_user")
    private String assignedUser;

    @JsonProperty("scheduled_start_date")
    @JsonDeserialize(using = TimestampDeserializser.class)
    private LocalDate scheduledStartDate;

    @JsonProperty("scheduled_end_date")
    @JsonDeserialize(using = TimestampDeserializser.class)
    private LocalDate scheduledEndDate;

    @JsonProperty("actual_start_date")
    @JsonDeserialize(using = TimestampDeserializser.class)
    private LocalDate actualStartDate;

    @JsonProperty("actual_end_date")
    @JsonDeserialize(using = TimestampDeserializser.class)
    private LocalDate actualEndDate;

    @JsonProperty("property_uuid")
    private String propertyUuid;

    @JsonProperty("completion_percent")
    private Double completionPercent;
}
