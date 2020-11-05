package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MeterDtoCount extends AbstractDto {

    private static final long serialVersionUID = -6295408942604978666L;
    
    private Map<String, Long> meterTypeCount;
    
    private Map<String, Long> meterCategoryWiseCount;
    
    private long activeMeterCount;
    
}
