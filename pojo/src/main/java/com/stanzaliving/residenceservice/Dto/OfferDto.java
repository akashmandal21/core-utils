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

@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@SuperBuilder
public class OfferDto {

    @JsonProperty("offer_name")
    private String offerName;

    @JsonProperty("service_mix_uuid")
    private String bundleId;

    @JsonProperty("residence_uuid")
    private String residenceUuid;

    @JsonProperty("products")
    private List<String> products;

    @JsonProperty("mandatory_products")
    private List<String> mandatoryProducts;

    @JsonProperty("add_on_plans")
    private List<String> addOnPlans;

    @JsonProperty("metadata")
    private Map<String, Object> metadata;

    @JsonProperty("offer_status")
    private String offerStatus = "Active";
}
