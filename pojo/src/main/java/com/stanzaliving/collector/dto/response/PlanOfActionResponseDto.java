package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.FeElementDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanOfActionResponseDto implements Comparable<PlanOfActionResponseDto>{
    String date;
    List<String> description;
    LocalDate localDate;

    @Override
    public int compareTo(PlanOfActionResponseDto planOfActionResponseDto) {
        return localDate.compareTo(planOfActionResponseDto.getLocalDate());
    }
}
