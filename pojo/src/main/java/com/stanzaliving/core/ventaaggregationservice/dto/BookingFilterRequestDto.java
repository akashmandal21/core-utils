package com.stanzaliving.core.ventaaggregationservice.dto;

import lombok.*;

import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookingFilterRequestDto {
    private Set<String> userUuids;
    private Set<String> bookingIds;
    private Set<String> cityList;
    private Set<String> residenceList;
    private Set<String> microMarketList;
    private Set<String> status;
    private Integer pageSize;
    private Integer pageNumber;
    private String sortBy;
    private String sortOrder;
    private String entity;
    private Set<String> leadIds;
    private Boolean moveIn;
    private String residentMobile;
    private String residentId;
    private boolean ignoreMoveInFlag;
}
