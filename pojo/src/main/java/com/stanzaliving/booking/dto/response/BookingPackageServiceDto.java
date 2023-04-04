package com.stanzaliving.booking.dto.response;

import com.stanzaliving.core.dto.PlanOptInRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingPackageServiceDto {

    private Date fromDate;

    private Date toDate;

    private String packageServiceUuid;

    private String bookingUuid;

    private String packageServiceName;

    private List<PlanOptInRequestDto> planOptInRequestDtoList;
}
