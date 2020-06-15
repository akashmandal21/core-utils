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
public class PoVendorDetailsCDC {

    @JsonProperty("id")
    private Long poVendorId;

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
    String poVendorUuid;

    @JsonProperty("po_details_id")
    private String poDetailsId;

    @JsonProperty("vendor_details_id")
    private String vendorDetailsId;

    @JsonProperty("vendor_poc_details_id")
    private String vendorPocDetailsId;

    @JsonProperty("comparison_document_url")
    private String comparisonDocumentUrl;

    @JsonProperty("is_warehouse_vendor")
    private Boolean isWarehouseVendor;
}
