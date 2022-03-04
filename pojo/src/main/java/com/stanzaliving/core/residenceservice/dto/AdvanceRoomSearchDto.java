package com.stanzaliving.core.residenceservice.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.residenceservice.enums.ResidenceSortBy;
import com.stanzaliving.core.residenceservice.enums.RoomStatus;
import com.stanzaliving.core.utilservice.annotations.DateFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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

}
