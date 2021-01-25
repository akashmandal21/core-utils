package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FrequentContactCDC {
    @JsonProperty("id")
    private Long freqContactId;

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
    String freqContactUuid;

    @JsonProperty( "property_uuid")
    private String propertyUuid;

    @JsonProperty("user_uuid")
    private String userUuid;

    @JsonProperty("is_vendor")
    private boolean vendor=false;

    @JsonProperty("contact_uuid")
    private String contactUuid;

    @JsonProperty("num_hits")
    private Integer numHits=1;
}
