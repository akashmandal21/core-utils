package com.stanzaliving.transformations.pojo;

import lombok.*;

/**
 * @author dhruv.mathur
 * @date 26/04/21
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetDetailsDto {

    private CategoryFilter listingsFor;
    private CategoryFilter column;
    private String uuid;
}
