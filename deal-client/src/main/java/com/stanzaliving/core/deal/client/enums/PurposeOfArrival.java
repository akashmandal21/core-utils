package com.stanzaliving.core.deal.client.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum PurposeOfArrival {

    STUDY("Study"), JOB("Job"), OTHERS("Any Other");

    private String name;

    private static final List<PurposeOfArrival> purposeOfArrivalList = new ArrayList<>();

    static {
        purposeOfArrivalList.addAll(Arrays.asList(PurposeOfArrival.values()));
    }

    public static List<EnumListing<PurposeOfArrival>> getPurposeOfArrivalEnumListing() {
        List<EnumListing<PurposeOfArrival>> enumListing = new ArrayList<>();
        for (PurposeOfArrival purposeOfArrival : purposeOfArrivalList) {
            enumListing.add(EnumListing.of(purposeOfArrival, purposeOfArrival.getName()));
        }
        return enumListing;
    }
}
