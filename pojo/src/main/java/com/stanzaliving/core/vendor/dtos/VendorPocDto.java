package com.stanzaliving.core.vendor.dtos;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VendorPocDto {

    private String name;
    private String designation;
    private String contact;
    private String email;
}
