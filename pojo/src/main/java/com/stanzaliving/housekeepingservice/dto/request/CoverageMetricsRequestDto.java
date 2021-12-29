package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * @author Priyadarshini MB
 */

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class CoverageMetricsRequestDto {

    private String planningTemplateUuid;
    private String microClusterUuid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    private String taskSubCategoryUuid;
    private String taskCategoryUuid;
}
