package com.stanzaliving.designservice.response.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class PhoenixDto {

    private String propertyUuid;

    private String phoenixName;

    private String cityName;

    private String micromarketName;

    private Integer noOfBeds;

    private Integer noOfRooms;

    private boolean commercialApproved;

    private String handoverDate;

    private Date submittedOn;

    private String addedBy;

    private String colorCode;

}
