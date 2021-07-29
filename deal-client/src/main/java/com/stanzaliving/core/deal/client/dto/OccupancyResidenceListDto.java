package com.stanzaliving.core.deal.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OccupancyResidenceListDto {

    List<Integer> occupancies;

    List<String> residences;
}
