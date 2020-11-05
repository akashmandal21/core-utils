package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.common.dto.ListingCountDto;
import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MeterDtoCount extends AbstractDto {

    private static final long serialVersionUID = -6295408942604978666L;
    
    private List<ListingCountDto> meterTypeCount;
    
    private List<ListingCountDto> meterCategoryWiseCount;
    
    private long activeMeterCount;
    
}
