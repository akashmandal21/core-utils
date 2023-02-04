package com.stanzaliving.residenceservice.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("plans")
    private List<String> plans;

    @JsonProperty("metadata")
    private Map<String, Object> metadata;

    @JsonProperty("offer_status")
    private int offerStatus = 1;
}
