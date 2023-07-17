package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.DealCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategoryResidenceConsumerDtoV2 implements Serializable {
    private List<String> categoryIdList;
    private String residenceId;
    private String dealId;
    private DealCategory dealCategory;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean serviceMixUpdate;
    private boolean foodDisabled;
    private String updateBy;
}
