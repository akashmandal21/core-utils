package com.stanzaliving.core.opscalculatorv2.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst" })
public class SuppliesCategoryV2Dto extends CategoryV2Dto {

    @Builder.Default
    private boolean isSuppliesApplicable = true;
    @Builder.Default
    private int suppliesCostPerMonth = 50;
}
