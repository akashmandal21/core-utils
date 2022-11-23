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
public class VendorGstDto {

    private String companyName;
    private String gstin;
    private UIKeyValue gstState;
    private String gstRegdAddress;
    private String gstCertificate;
    private Boolean defaultGST;
}
