package com.stanzaliving.operations.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ServiceMixServiceType {
    FOOD(1, "Food", "food", 1),
    HOUSE_KEEPING(2, "House Keeping", "houseKeeping", 2),
    INTERNET(3, "Internet", "internet", 3),
    GYM(4, "Gym", "gym", 4),
    LAUNDRY(5, "Laundry", "laundry", 5),
    SECURITY(6, "Security", "security", 6),
    TRANSPORT(7, "Transport", "transport", 7),
    ELECTRICITY(8, "Electricity", "electricity", 8),
    OTHERS(9, "Others", "other", 9);

    private Integer serviceId;

    private String serviceName;

    private String serviceNameLowerCase;

    private Integer sequence;

    private static List<EnumListing<ServiceMixServiceType>> serviceMixServiceSetEnumListing = new ArrayList<>();

    static {

        for (ServiceMixServiceType serviceMixServiceSet : ServiceMixServiceType.values()) {
            serviceMixServiceSetEnumListing.add(EnumListing.of(serviceMixServiceSet, serviceMixServiceSet.getServiceName()));
        }
    }

    public static List<EnumListing<ServiceMixServiceType>> getServiceMixServiceSetListing() {
        return serviceMixServiceSetEnumListing;
    }

}