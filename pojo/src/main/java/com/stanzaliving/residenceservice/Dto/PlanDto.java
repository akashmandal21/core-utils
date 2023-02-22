package com.stanzaliving.residenceservice.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.residenceservice.enums.VasCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@SuperBuilder
public class PlanDto {

    @JsonProperty("plan_name")
    private String planName;

    @JsonProperty("plan_category")
    private VasCategory planCategory;

    @JsonProperty("plan_residence")
    private String residenceUuid;

    @JsonProperty("jarvis_plan_id")
    private String jarvisPlanId;

    @JsonProperty("product")
    private List<String> products;

    @JsonProperty("description")
    private Map<String, String> description;

    @JsonProperty("metadata")
    private Map<String, Object> metadata;

    @JsonProperty("plan_status")
    private int planStatus = 1;

    @JsonProperty("plan_type")
    private String planType;

    @JsonProperty("plan_hierarchy")
    private Integer hierarchy;

}
