package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PDFInputRequestDto {

    private String hkName;

    private LocalDate date;

    private List<ShiftTaskDto> shifts;
}
