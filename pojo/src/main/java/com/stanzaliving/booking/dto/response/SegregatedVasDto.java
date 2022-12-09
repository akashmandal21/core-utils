package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SegregatedVasDto {

    private List<WandaResidenceVasDto> otherVasList;
    private List<WandaResidenceVasDto> selectedVasList;

}
