package com.stanzaliving.smartlock.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OacDetailDto {
    Date modified;
    String _id;
    Integer OACType;
    String deviceId;
    String doorId;
    String nodeId;
    Date endTime;
    String reason;
    String grantedBy;

    String grantedTo;

    @JsonProperty("OAC")
    String OAC;

    Date timestamp;

    Date startTime;

    @JsonProperty("OACId")
    String OACId;
}