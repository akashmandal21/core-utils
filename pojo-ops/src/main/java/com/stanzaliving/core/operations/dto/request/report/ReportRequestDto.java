package com.stanzaliving.core.operations.dto.request.report;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate startDate = LocalDate.now().minusDays(LocalDate.now().getDayOfMonth() - 1);

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate endDate = LocalDate.now();

    AccessLevel accessLevel = AccessLevel.CITY;

    @AssertFalse
    public boolean isInvalidDateRange() {
        return startDate.isBefore(((Integer) endDate.getDayOfMonth()).equals(1) ? endDate.minusYears(1) : endDate.minusMonths(11).minusDays(endDate.minusMonths(11).getDayOfMonth() - 1));
    }

}
