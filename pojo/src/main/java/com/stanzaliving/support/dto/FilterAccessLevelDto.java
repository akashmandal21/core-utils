package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilterAccessLevelDto {
    private AccessLevel originalAccessLevel;
    private List<String> cityList;
    private List<String> micromarketList;
    private List<String> residenceList;
}
