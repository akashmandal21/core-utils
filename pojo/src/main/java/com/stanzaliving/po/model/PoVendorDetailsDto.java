package com.stanzaliving.po.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoVendorDetailsDto {

    private String poVendorDetailsId;

    private String vendorDetailsId;

    private String vendorPocDetailsId;

    private String comparisonDocumentUrl;

}
