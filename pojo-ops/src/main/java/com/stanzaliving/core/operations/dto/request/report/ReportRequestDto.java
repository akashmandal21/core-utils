package com.stanzaliving.core.operations.dto.request.report;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ReportRequestDto {

    List<String> cityUuid;

    List<String> micomarketUuid;

    List<String> residenceUuid;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate;

}
