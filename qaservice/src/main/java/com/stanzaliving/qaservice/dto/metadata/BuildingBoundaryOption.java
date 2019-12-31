package com.stanzaliving.qaservice.dto.metadata;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuildingBoundaryOption {
    Boolean isMandatory;
    List<Long> questionIds;
}
