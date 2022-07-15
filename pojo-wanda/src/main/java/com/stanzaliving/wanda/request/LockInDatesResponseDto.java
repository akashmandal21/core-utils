package com.stanzaliving.wanda.request;


import com.stanzaliving.wanda.response.LockInDate;
import com.stanzaliving.wanda.response.MonthAndYear;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LockInDatesResponseDto {

    private List<String> lockInDates;

    private Set<MonthAndYear> lockInMonths;

    private Map<String, LockInDate> lockInDatesForMonth;

}
