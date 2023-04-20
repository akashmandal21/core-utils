/**
 * @author gaurav.likhar
 * @date 18/04/23
 * @project_name booking-service-v2
 **/

package com.stanzaliving.booking.enums;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum BookingPreference {
    DEFAULT,
    PRIMARY,
    SECONDARY;

    public static List<BookingPreference> bookingPreferenceEligibleForListing(){
        List<BookingPreference> bookingPreferenceList = new ArrayList<>();
        bookingPreferenceList.add(BookingPreference.DEFAULT);
        bookingPreferenceList.add(BookingPreference.PRIMARY);
        return bookingPreferenceList;
    }
}
