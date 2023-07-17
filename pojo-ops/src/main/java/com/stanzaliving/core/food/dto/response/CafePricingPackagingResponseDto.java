package com.stanzaliving.core.food.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author ramesh.sutlaiya
 */

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CafePricingPackagingResponseDto implements Serializable {

    private String packagingName;

    private Integer qty;

}
