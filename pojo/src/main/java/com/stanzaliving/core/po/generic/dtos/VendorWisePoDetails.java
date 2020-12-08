package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.vendor.model.VendorPocDetailsDto;
import lombok.*;

import java.util.List;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VendorWisePoDetails {
    private String vendorName;

    private String propertyUuid;

    private String vendorUuid;

    private Set<VendorPocDetailsDto> pocDetailsDtos;
}
