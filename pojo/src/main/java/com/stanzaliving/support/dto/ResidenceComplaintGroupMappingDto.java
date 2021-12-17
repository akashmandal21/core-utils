package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceComplaintGroupMappingDto {

    private AccessLevel accessLevel;
    private List<String> headerList;
    private List<ResidenceGroupMappingDto> residenceGroupMappingDto;
    private Boolean hasChild;

}
