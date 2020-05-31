package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.designservice.enums.PhoenixDesignStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoenixBedCountDesignCDC {

    @JsonProperty("id")
    private Long bedCountId;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("updated_at")
    private Date updatedAt;

    @JsonProperty("updated_by")
    private String updatedBy;

    @JsonProperty("status")
    private boolean status = true;

    @JsonProperty("uuid")
    String bedCountUuid;

    @JsonProperty("property_uuid")
    private String propertyUuid;

    @JsonProperty("no_of_beds")
    private Integer noOfBeds;

    @JsonProperty("phoenix_beds")
    private Integer phoenixBeds;

    @JsonProperty("pheonix_rooms")
    private Integer phoenixRooms;

    @JsonProperty("prima_beds")
    private Integer primaBeds;

    @JsonProperty("summa_beds")
    private Integer summaBeds;

    @JsonProperty("magna_beds")
    private Integer magnaBeds;

    @JsonProperty("no_of_floors")
    private Integer noOfFloors;

    @JsonProperty("no_of_rooms")
    private Integer noOfRooms;


    @JsonProperty("design_status")
    private String phoenixDesignStatus;//Change PhoenixDesignStatus to String

    @JsonProperty("commercial_approved")
    private boolean commercialApproved = false;

    @JsonProperty("handover_date")
    private String handoverDate;

    @JsonProperty("submitted_on")
    private Date submittedOn;

    @JsonProperty("remark")
    private String phoenixDesignRemark;

    @JsonProperty("leased_property_area")
    private Integer propertyLeasedArea;

}