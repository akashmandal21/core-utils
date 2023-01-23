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
   private Date modified;
   private String _id;
   private Integer OACType;
   private String deviceId;
   private String doorId;
   private String nodeId;
   private Date endTime;
   private String reason;
   private String grantedBy;

   private String grantedTo;

    @JsonProperty("OAC")
    private String OAC;

    private Date timestamp;

    private Date startTime;

    @JsonProperty("OACId")
    private String OACId;
}