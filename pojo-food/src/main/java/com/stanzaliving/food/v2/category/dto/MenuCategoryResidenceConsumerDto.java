package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.operations.enums.DealCategory;
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
    private DealCategory dealCategory;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean foodDisabled;
    private String updateBy;
}
