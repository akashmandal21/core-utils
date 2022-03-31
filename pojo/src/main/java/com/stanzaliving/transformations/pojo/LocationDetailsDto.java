package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.projections.StanzaGstView;
import com.stanzaliving.vendor.model.VendorAndPocDetails;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class LocationDetailsDto {
    private AddressBookMetaDto addressBookMetaDto;
    private StanzaGstView stanzaGstView;
    private List<VendorAndPocDetails> vendorAndPocDetailsList;
}
