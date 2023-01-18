package com.stanzaliving.core.food.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceLevelFoodRating {

    Integer totalRatingCount;
    Integer fiveStarRatingCount;

}
