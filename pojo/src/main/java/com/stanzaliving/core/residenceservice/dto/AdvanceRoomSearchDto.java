package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.core.base.common.dto.RoommateFilterDto;
import com.stanzaliving.core.estate.enums.EstateGender;
import com.stanzaliving.core.residenceservice.enums.ResidenceSortBy;
import com.stanzaliving.core.residenceservice.enums.RoomStatus;
import com.stanzaliving.core.user.acl.enums.Role;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdvanceRoomSearchDto {

    private int page;
    @Builder.Default
    private int limit = 10;

    private double inventoryMinPrice;
    @Builder.Default
    private double inventoryMaxPrice = Double.MAX_VALUE;

    private boolean sold;
    private boolean inventoryView;
    private boolean insideSalesView;
    private boolean remoteBookingFlag;

    private String moveInDate;
    private String roomNumber;
    private String moveOutDate;
    private String residenceUuid;
    private String microMarketId;
    private String residenceName;
    private String referralUserUuid;
    private String referralRoomNumber;

    private List<Role> roles;
    private List<String> floors;
    private List<Integer> bhkType;
    private List<String> roomUuids;
    private List<String> attributes;
    private List<Integer> occupancies;
    private List<EstateGender> genders;
    private List<RoomStatus> roomStatus;

    @Builder.Default
    private ResidenceSortBy sortBy = ResidenceSortBy.DEFAULT;
    private RoommateFilterDto roommateFilterDto;

}