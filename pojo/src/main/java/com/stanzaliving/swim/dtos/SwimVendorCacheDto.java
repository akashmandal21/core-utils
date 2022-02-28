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
public class SwimVendorCacheDto {

    private String vendorCode;
    private String uuid;
    private Department department;
}
