package com.stanzaliving.food.v2.category.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategoryResidenceConsumerDto implements Serializable {
    private String categoryId;
    private String residenceId;
    private String dealId;
    private LocalDate startDate;
    private String updateBy;
}
