package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 22-Oct-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealTypeResponseDto {
    private List<MealDetails> details;
    private CustomResidenceDetailsResponseDto residence;
    private String residenceId;
    private String residenceName;
    private List<MealDetails> mealDetails;
}
