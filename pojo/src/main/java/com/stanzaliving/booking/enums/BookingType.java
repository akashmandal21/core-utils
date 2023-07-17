package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
@AllArgsConstructor
public enum BookingType {

    PROFESSIONAL("Working Professional", 4), //SUITES_BOOKING(4), WP_RETENTION(5)
    SCHOLAR("Student", 5), //new(0)
    ALL("All" , 0),
    B2B("B2B" , 1), //B2B (3)
    B2C_NEW_CLOSURES("B2C-new closures" , 2),
    B2C_RETENTION("B2C-Retention" , 3),
    MANAGED_APARTMENT("Managed Apartment",6),
    SUITS("Suits", 7),
    EMPTY("Empty", 8);

    private String type;
    int value;

    public static Map<String , BookingType> getBookingTypeList(){
        Map<String, BookingType> bookingTypeMap = new HashMap<>();
        for(BookingType bookingType : BookingType.values()){
            bookingTypeMap.put(bookingType.name() , bookingType);
        }
        return bookingTypeMap;
    }

    public static BookingType getBookingType(String bookingType){
        Map<String, BookingType> bookingTypeMap = getBookingTypeList();
        if(bookingTypeMap.containsKey(bookingType)) return bookingTypeMap.get(bookingType);
        return null;
    }

    public static BookingType migrationBookingType(int bookingTypeValue){
        switch (bookingTypeValue){
            case 4:
            case 5:
               return BookingType.PROFESSIONAL;
            case 0:
            case 1:
            case 2:
                return BookingType.SCHOLAR;
            case 3:
                return BookingType.B2B;
            default:
                return null;
        }
    }

    public static Set<String> getExitInitiateBookingTypes(){
        Set<String> types = new HashSet<>();
        types.add(BookingType.SCHOLAR.name());
        types.add(BookingType.PROFESSIONAL.name());
        types.add(BookingType.MANAGED_APARTMENT.name());
        return types;
    }

}

