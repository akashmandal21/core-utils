package com.stanzaliving.core.electricity.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.common.dto.ListingCountDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
