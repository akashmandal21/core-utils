package com.stanzaliving.boq_service.dto;

import com.stanzaliving.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusAndCitiesToShowDto {
    private List<BoqStatus> statusToShow;

    private List<String> citiesToShow;
}
