package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.po.enums.POSummaryStatus;
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
public class PoSummaryStatusCDC {

    @JsonProperty("id")
    private Long poSummaryId;

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
    String poSummaryUuid;

    @JsonProperty( "property_id")
    private String propertyUuid;

    @JsonProperty("po_type")
    PoType poType;

    @JsonProperty("po_summary_status")
    POSummaryStatus poSummaryStatus;
}
