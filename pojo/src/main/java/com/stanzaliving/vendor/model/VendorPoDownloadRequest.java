package com.stanzaliving.vendor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class VendorPoDownloadRequest {

    @NotBlank(message = "Vendor Details Id can't be blank")
    private String vendorDetailsId;

    @NotBlank(message = "Vendor Poc Details Id can't be blank")
    private String vendorPocDetailsId;

    @NotBlank(message = "State can't be blank")
    private String state;

}
