package com.stanzaliving.swim.dtos;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SwimItemCacheDto {

    private String itemCode;
    private String uuid;
    private Department department;

}
