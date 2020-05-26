package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.FeElementDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanOfActionResponseDto {
    String created;
    List<String> description;
}
