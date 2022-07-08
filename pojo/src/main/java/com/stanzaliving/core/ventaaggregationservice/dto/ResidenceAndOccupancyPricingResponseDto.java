package com.stanzaliving.core.ventaaggregationservice.dto;

import com.stanzaliving.website.enums.FomoTag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

import com.stanzaliving.website.enums.FomoTag;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResidenceAndOccupancyPricingResponseDto {

    private String residenceName;
    private Integer gender;
    private boolean enabled;
    private List<Map<String,String>> occupancyPricing;
    private List<String> attributeName;
    private List<String> consumableName;
    private Integer residenceTypeId;
    private String propertyCode;
    private String residenceUuid;
    private FomoTag fomoTag;
}




/*
    =================== EXAMPLE JSON ===========

points- 

->for managed apartments-  

1. gender field of apartment will be having effective gender [as per the current female booking person choice]

2. added new fields-
	i. "roomId": "unique room id which will be always unique and same for that room of that apartment",
	ii. attributeName & consumableName
	iii. room level starting price


JSON:-

[
    {
        "residenceName": "Semey House",
        "gender": 1,
        "enabled": true,
        "occupancyPricing": [
            {
                "occupancy": "2",
                "occupancyName": "Twin sharing",
                "startingPrice": "9400"
            },
            {
                "occupancy": "3",
                "occupancyName": "Triple sharing",
                "startingPrice": "8400"
            },
            {
                "occupancy": "4",
                "occupancyName": "4 sharing",
                "startingPrice": "7600"
            }
        ],
        "attributeName": [
            "Fan",
            "Hot Water",
            "Attached Washroom"
        ],
        "consumableName": [
            "Bed",
            "Chair",
            "Mattress",
            "Fan",
            "Tubelight / LED",
            "Cupboard / Almirah",
            "Study Table"
        ],
        "residenceTypeId": 0,
        "propertyCode": "PLX",
        "residenceUuid": "9c13fd4a-2939-41f1-824d-5c8376789e20",
        "fomoTag": "ALMOSTFULL"
    },
    {
        "residenceName": "Studio 21 HK001",
        "gender": 2,
        "enabled": true,
        "occupancyPricing": [
            {
                "roomId": "room1 : unique room id which will be always unique and same for that room of that apartment",
                "occupancy": "SINGLE_ROOM",
                "isSoldOut": "false",
                "occupancyName": "Single Room",
                "startingPrice": "15399",
                "attributeName": [
                    "AC",
                    "Attached Washroom",
                    "Hot Water",
                    "Fan",
                    "Window"
                ],
                "consumableName": [
                    "Bed",
                    "Chair",
                    "Cupboard / Almirah",
                    "Study Table",
                    "Pillow",
                    "Mattress",
                    "Mirror",
                    "Dustbin",
                    "Tubelight / LED",
                    "Fan"
                ]
            },
            {
                "roomId": "room2: unique room id which will be always unique and same for that room of that apartment",
                "occupancy": "SINGLE_ROOM",
                "isSoldOut": "false",
                "occupancyName": "Single Room",
                "startingPrice": "14399",
                "attributeName": [
                    "AC",
                    "Attached Washroom",
                    "Hot Water",
                    "Fan",
                    "Window"
                ],
                "consumableName": [
                    "Bed",
                    "Chair",
                    "Cupboard / Almirah",
                    "Study Table",
                    "Pillow",
                    "Mattress",
                    "Mirror",
                    "Dustbin",
                    "Tubelight / LED",
                    "Fan"
                ]
            },
            {
                "roomId": "room 3: unique room id which will be always unique and same for that room of that apartment",
                "occupancy": "SINGLE_ROOM",
                "isSoldOut": "false",
                "occupancyName": "Single Room",
                "startingPrice": "12399",
                "attributeName": [
                    "AC",
                    "Attached Washroom",
                    "Hot Water",
                    "Fan",
                    "Window"
                ],
                "consumableName": [
                    "Bed",
                    "Chair",
                    "Cupboard / Almirah",
                    "Study Table",
                    "Pillow",
                    "Mattress",
                    "Mirror",
                    "Dustbin",
                    "Tubelight / LED",
                    "Fan"
                ]
            },
            {
                "isEntireFlatAvailable": "false",
                "occupancy": "ENTIRE_FLAT",
                "isSoldOut": "false",
                "occupancyName": "Entire Flat",
                "startingPrice": "47698"
            }
        ],
        "attributeName": [
            "AC",
            "Attached Washroom",
            "Hot Water",
            "Fan",
            "Window"
        ],
        "consumableName": [
            "Bed",
            "Chair",
            "Cupboard / Almirah",
            "Study Table",
            "Pillow",
            "Mattress",
            "Mirror",
            "Dustbin",
            "Tubelight / LED",
            "Fan"
        ],
        "residenceTypeId": 0,
        "propertyCode": "HKA01",
        "residenceUuid": "4f268ec4-1e3e-48a3-bbb4-388adbaa0a46",
        "fomoTag": "SOLDOUT"
    }
]



*/