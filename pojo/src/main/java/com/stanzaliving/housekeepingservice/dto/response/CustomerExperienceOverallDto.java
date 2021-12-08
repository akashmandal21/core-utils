package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class CustomerExperienceOverallDto {

    private List<ResidenceDto> residenceList;

    private List<ResidenceDto> vendorList;

    private Map<String, List<String>> roomsList;

}
