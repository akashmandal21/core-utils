package com.stanzaliving.core.ventaaggregationservice.dto;

import com.stanzaliving.core.user.dto.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingAggregationEntityDto {
    private String dealUuid; //booking table

    private String bookingUuid; //booking table

    private String userUuid; //booking table

    private String residentName; //booking table using user_uuid/

    private String residentId; //booking table user_uuid

    private String residentMobile; //booking table using user_uuid

    private String residentEmail; //booking table using user_uuid

    private String roomNumber; // room id in InventoryOccupancy

    private String bookingStatus; //booking table booking_status

    private Date contractStartDate; //booking table contract_start_date

    private Date contractEndDate;//booking table

    private String residenceName; //using room id from InventoryOccupancy

    private Double dues;

    private String dealName;

    private String dealType;

    private List<String> residencesApplicable;

    private Integer beds;

    private Date lockinStartDate;

    private Date lockinEndDate;

    private String lockinDuration;

    private Address billTo;

    private String billFrom;

    private String contractDuration;

    private String residenceUuid;

}
