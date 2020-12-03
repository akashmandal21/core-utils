/**
 *
 */
package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.cafe.enums.CafeTags;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Ashutosh.Chandra
 *
 * @date 22-Oct-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeListingDto {

    private String uuid;

    private String cafeName;

    private List<CafeTags> tags;

    private String cityId;

    private String cityName;

    private List<BaseKitchenDto> baseKitchens;

    private long mappedResidenceCount;


}