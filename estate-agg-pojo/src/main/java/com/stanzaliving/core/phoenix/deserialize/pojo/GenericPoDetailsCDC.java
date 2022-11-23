package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.stanzaliving.core.agg.deserializers.LocalDateTimeTimestampDeserializer;
import com.stanzaliving.core.agg.deserializers.TimestampDeserializser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenericPoDetailsCDC {

    @JsonProperty("id")
    private Long poId;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("updated_at")
    private Date updatedAt;

    @JsonProperty("updated_by")
    private String updatedBy;

    @JsonProperty("creator_department")
    private String department;

    @JsonProperty("status")
    private boolean status = true;

    @JsonProperty("as_is_po")
    private boolean asisPo = false;

    @JsonProperty("uuid")
    String poUuid;

    @JsonProperty( "property_uuid")
    private String propertyUuid;

    @JsonProperty( "po_number")
    private String poNumber;

    @JsonProperty( "po_type")
    private String poType;

    @JsonProperty( "scope_of_work")
    private String scopeOfWork;

    @JsonProperty( "po_status")
    private String poStatus; //Change PoStatus to String

    @JsonProperty( "approved_status_at")
    @JsonDeserialize(using = LocalDateTimeTimestampDeserializer.class)
    private LocalDateTime approvalDate;

}
