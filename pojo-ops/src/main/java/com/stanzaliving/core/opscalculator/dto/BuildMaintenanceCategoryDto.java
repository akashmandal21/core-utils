package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class BuildMaintenanceCategoryDto extends CategoryDto {
    private PestControlDto pestControlDto;
    private FloorCleaningDto floorCleaningDto;
    private TankCleaningInfoDto tankCleaningInfoDto;
    private FacadeCleaningDto facadeCleaningDto;
    private UpholsteryCleaningDto upholsteryCleaningDto;
    private FumigationPerBedBugsDto fumigationPerBedBugsDto;
    private GarbageCostDto garbageCostDto;
}
