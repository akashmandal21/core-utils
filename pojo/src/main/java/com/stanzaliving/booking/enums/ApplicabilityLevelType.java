package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ApplicabilityLevelType {
    CITY("City"), MICROMARKET("Micromarket"), RESIDENCE("Residence"), CLUSTER("Cluster"), SOCIETY("Society"), ALL("All");

    String name;
}
