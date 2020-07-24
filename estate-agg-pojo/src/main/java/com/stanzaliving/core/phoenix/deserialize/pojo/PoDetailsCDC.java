package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.po.enums.PoStatus;
import com.stanzaliving.po.enums.PoType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PoDetailsCDC {

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

    @JsonProperty("status")
    private boolean status = true;

    @JsonProperty("uuid")
    String poUuid;

    @JsonProperty( "property_id")
    private String propertyUuid;

    @JsonProperty( "po_number")
    private String poNumber;

    @JsonProperty( "po_type")
    private String poType; //Change PoType to String

    @JsonProperty( "scope_of_work")
    private String scopeOfWork;

    @JsonProperty( "completion_date")
    private Date completionDate;

    @JsonProperty( "stanza_gstin")
    private String stanzaGstin;

    @JsonProperty( "delivery_location")
    private String deliveryLocation;

    @JsonProperty( "bill_to_address")
    private String billToAddress;

    @JsonProperty( "po_status")
    private String poStatus; //Change PoStatus to String

    @JsonProperty( "approval_date")
    private Date approvalDate;

    @JsonProperty( "rejected_count")
    private Integer rejectedCount;

    @JsonProperty( "po_download_url")
    private String poDownloadUrl;
}
