package com.stanzaliving.core.dto;


import lombok.Data;

@Data
public class CityResponseDTO {
    private int cityId;

    private String name;

    private String code;

    private int stateId;

    private String stateName;

    private boolean brokerAppVisible;

    private double latitude;

    private double longitude;

    private Integer cityLevelMaxDiscountId;

    private Double maxDiscountAllowed;

}