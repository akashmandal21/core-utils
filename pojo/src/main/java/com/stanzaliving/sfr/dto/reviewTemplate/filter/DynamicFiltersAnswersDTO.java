package com.stanzaliving.sfr.dto.reviewTemplate.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Comparator;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DynamicFiltersAnswersDTO {

    String id;
    String value;
    Integer count;

    public static Comparator<DynamicFiltersAnswersDTO> AnswersComparator = (answer1, answer2) -> {

        String DynamicFiltersAnswersDTOName1
                = answer1.getValue().toUpperCase();
        String DynamicFiltersAnswersDTOName2
                = answer2.getValue().toUpperCase();

        // ascending order
        return DynamicFiltersAnswersDTOName1.compareTo(
                DynamicFiltersAnswersDTOName2);
    };

}
