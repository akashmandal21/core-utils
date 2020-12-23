package com.stanzaliving.core.cafe.order.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class VasMealSlotMappingCSVDto {
    @CsvBindByName(column = "Residence_Id")
    private String residenceId;

    @CsvBindByName(column = "Meal_Type")
    private String mealType;

    @CsvBindByName(column = "Slot Id")
    private String slotId;
}
