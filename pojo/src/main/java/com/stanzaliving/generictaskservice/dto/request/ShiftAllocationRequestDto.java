package com.stanzaliving.generictaskservice.dto.request;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Vikas S T
 * @date 24-Aug-21
 **/
@Data
public class ShiftAllocationRequestDto {
    List<String> shiftAllocationUuidList;
    private LocalDate fromDate;
    private LocalDate toDate;
}
