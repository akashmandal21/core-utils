package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Priyadarshini MB
 */

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class CoverageMetricsDetailsRequestDto {

    private String planningTemplateUuid;
    private String microClusterUuid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    private String taskSubCategoryUuid;
    private String residenceUuid;
}
