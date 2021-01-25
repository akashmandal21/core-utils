package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.projectservice.enums.BedCountStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BedCountEntityCDC {
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

    @JsonProperty( "bd_bed_count")
    private String bdBedCount;

    @JsonProperty("prima_bed_count")
    private Integer primaBedCount;

    @JsonProperty("design_bed_count")
    private Integer designBedCount;

    @JsonProperty("design_room_count")
    private Integer designRoomCount;

    @JsonProperty("deviation_in_bed_count")
    private Integer deviationInBedCount;

    @JsonProperty("bed_count_status")
    private BedCountStatus bedCountStatus;

    @JsonProperty("version_number")
    private Integer versionNumber;

    @JsonProperty( "deviation_reason")
    private String deviationReason;

}
