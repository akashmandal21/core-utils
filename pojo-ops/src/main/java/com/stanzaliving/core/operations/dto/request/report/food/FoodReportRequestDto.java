package com.stanzaliving.core.operations.dto.request.report.food;

import com.stanzaliving.core.operations.dto.request.report.ReportRequestDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodReportRequestDto extends ReportRequestDto implements Cloneable {

    List<String> mealUuid;

    List<String> vendorUuid;

    protected Object clone() {
        return super.clone();
    }

}
