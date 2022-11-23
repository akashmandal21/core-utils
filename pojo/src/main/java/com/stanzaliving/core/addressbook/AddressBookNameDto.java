package com.stanzaliving.core.addressbook;

import com.stanzaliving.transformations.enums.LocationType;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AddressBookNameDto {

    private LocationType locationType;
    private String addressUuid;
    private String locationName;
}
