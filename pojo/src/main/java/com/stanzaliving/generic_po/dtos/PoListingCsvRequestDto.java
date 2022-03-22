package com.stanzaliving.generic_po.dtos;


import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoListingCsvRequestDto {

    private Set<Department> departments;
    private Set<GenericPOTOStatus> status;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isPo;
}
