package com.stanzaliving.swim;


import com.stanzaliving.transformations.enums.LocationType;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class AddressBookDto {

    private String addressBookUuid;
    private LocationType locationType;
    private String locationUuid;
    private String locationName;
    private String cityUUID;
    private String stateUUID;
    private String countryUUID;
    private String micromarketUUID;
    private String pincode;

}
