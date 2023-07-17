package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.dto.PageAndSortDto;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceDefaulterSearchRequestDto extends AbstractDto {

    private String searchKeyword;

    private LocalDate date;

    private PageAndSortDto pageDto;
}
