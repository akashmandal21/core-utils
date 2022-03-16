package com.stanzaliving.generic_po.dtos;


import com.stanzaliving.core.base.enums.Department;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CsvRequestDto {

    private Set<Department> departments;
    private Set<String> status;
    private LocalDate startDate;
    private LocalDate endDate;
}
