package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.core.base.common.dto.RoommateFilterDto;
import com.stanzaliving.core.residenceservice.enums.ResidenceSortBy;
import com.stanzaliving.core.residenceservice.enums.RoomStatus;
import com.stanzaliving.core.utilservice.annotations.DateFormat;

import com.stanzaliving.website.request.dto.UserRoleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdvanceRoomSearchDto extends UserRoleDto {

    private String residenceUuid;

    private String roomNumber;

    private List<Integer> occupancies;

    private List<String> floors;

    private List<RoomStatus> roomStatus;

    @DateFormat(message = "Move-in date is invalid | Expected format 'yyyy-dd-MM'")
    @NotBlank(message = "Move-in date cannot be empty")
    private String moveInDate;

    private List<String> attributes;

    private Double inventoryMinPrice;

    private Double inventoryMaxPrice;

    @Builder.Default
    private Integer page = 0;

    @Builder.Default
    private Integer limit = 10;

    private ResidenceSortBy sortBy;

    private String moveOutDate;

    private String microMarketId;
    private String residenceName;
    private List<Integer> bhkType;
    private Boolean inventoryView;

    private RoommateFilterDto roommateFilterDto;

    private List<String> roomUuids;

    @Builder.Default
    private Boolean isSold = false;

    @Builder.Default
    private Boolean remoteBookingFlag = false;

    @Builder.Default
    private Boolean showSoftBlockedBeds = false;

}
