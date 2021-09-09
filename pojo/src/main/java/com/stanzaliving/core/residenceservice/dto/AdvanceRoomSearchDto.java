package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.core.residenceservice.enums.ResidenceSortBy;
import com.stanzaliving.core.residenceservice.enums.RoomStatus;
import com.stanzaliving.core.utilservice.annotations.DateFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
public class AdvanceRoomSearchDto {

    @NotBlank(message = "Residence uuid cannot be empty")
    @NotNull(message = "Residence uuid cannot be null")
    private String residenceUuid;

    private String roomNumber;

    private List<Integer> occupancies;

    private List<String> floors;

    private List<RoomStatus> roomStatus;

    @DateFormat(message = "Move-in date is invalid | Expected format 'yyyy-dd-MM'")
    @NotBlank(message = "Move-in date cannot be empty")
    private String moveInDate;

    private List<String> attributes;

    private String inventoryMinPrice;

    private String inventoryMaxPrice;

    private Integer page;

    private Integer limit;

    private ResidenceSortBy sortBy;

    private String moveOutDate;
}
