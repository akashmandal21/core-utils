package com.stanzaliving.community.response;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceFilterCountResponseDTO {
    private Integer freeEvents;
    private Integer minPrice;
    private Integer maxPrice;
}
