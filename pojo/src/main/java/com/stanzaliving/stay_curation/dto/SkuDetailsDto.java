
package com.stanzaliving.stay_curation.dto;

import com.stanzaliving.residenceservice.enums.VasCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class SkuDetailsDto {

    private VasCategory category;

    @Builder.Default
    private List<StockUnitDetailsDto> stockUnitDetails = new ArrayList<>();

}
