package com.stanzaliving.estate_v2.dto.reviewTemplate;

import com.stanzaliving.designservice.response.dto.LeadershipBedTypeCountResponseDto;
import com.stanzaliving.designservice.response.dto.LeadershipFloorBedTypeDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BedCountInfoDto {
    private LeadershipBedTypeCountResponseDto bedTypeInfo;
    private List<LeadershipFloorBedTypeDto> floorDesignInfo;
}
