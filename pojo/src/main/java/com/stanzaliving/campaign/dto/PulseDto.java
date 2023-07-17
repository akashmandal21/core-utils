package com.stanzaliving.campaign.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class PulseDto {
    private Double achievementPercentage;
    private List<PulseCategory> pulseCategoryList;
}
