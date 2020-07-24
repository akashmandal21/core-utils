package com.stanzaliving.designservice.response.dto;

import com.stanzaliving.designservice.enums.PhoenixDesignStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class PhoenixBedCountResponseDto {

    private String propertyUuid;

    private Integer noOfRooms;

    private int bdBedCount;

    private int primaBed;

    private int magnaBed;

    private int summaBed;

    private int primaRoom;

    private int magnaRoom;

    private int summaRoom;
    
    private Integer phoenixBed;
    
    private Integer phoenixRoom;

    private String phoenixDesignRemark;

    private String reasonForNoPrima;

    private String reasonForNoMagna;

    private String reasonForNoSumma;

    private PhoenixDesignStatus phoenixDesignStatus;

    private String designDescription;

    private Date updatedAt;

}
