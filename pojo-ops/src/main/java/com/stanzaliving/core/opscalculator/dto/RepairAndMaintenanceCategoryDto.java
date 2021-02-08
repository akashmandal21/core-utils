/**
 * @author nipunaggarwal
 */
package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class RepairAndMaintenanceCategoryDto extends CategoryDto {

    private BuildMaintenanceCategoryDto buildMaintenanceCategoryDto;
    private RepairCategoryDto repairCategoryDto;

    public Object clone() {
        RepairAndMaintenanceCategoryDto clone = (RepairAndMaintenanceCategoryDto) super.clone();
        clone.buildMaintenanceCategoryDto = buildMaintenanceCategoryDto != null ? (BuildMaintenanceCategoryDto) buildMaintenanceCategoryDto.clone() : null;
        clone.repairCategoryDto = repairCategoryDto != null ? (RepairCategoryDto) repairCategoryDto.clone() : null;
        return clone;
    }

}
