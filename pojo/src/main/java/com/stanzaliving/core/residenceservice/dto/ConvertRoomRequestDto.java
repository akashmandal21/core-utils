package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.core.utilservice.annotations.DateFormat;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ConvertRoomRequestDto {

    @NotBlank(message = "service mix uuid field cannot be empty")
    private String serviceMixUUID;

    @NotBlank(message = "room number uuid field cannot be empty")
    private String roomNumberUUID;

    @NotBlank(message = "from date field cannot be empty")
    @DateFormat(message = "date is invalid | Expected format 'yyyy-MM-dd'", pattern = "yyyy-MM-dd")
    private String fromDate;

    private String toDate;

    @Min(value = 1, message = "current occupancy must be greater than zero")
    @NotNull(message = "current occupancy cannot be empty")
    private Integer currentOccupancy;

    @Min(value = 1, message = "new occupancy must be greater than zero")
    @NotNull(message = "new occupancy cannot be empty")
    private Integer newOccupancy;

    private String bookingInventoryUUID;

    private Boolean isAlreadyConverted;

    private String inventoryUuid;

    private boolean nonRecommendedRoom;

}