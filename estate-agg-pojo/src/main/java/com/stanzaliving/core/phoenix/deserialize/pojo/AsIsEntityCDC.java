package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.stanzaliving.core.agg.deserializers.TimestampDeserializser;
import com.stanzaliving.core.asis.enums.POStatus;
import com.stanzaliving.core.asis.enums.SiteVisitStatus;
import com.stanzaliving.core.projectservice.enums.AsIsStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AsIsEntityCDC {

    @JsonProperty("id")
    private Long asisId;

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
    String asisUuid;

    @JsonProperty("property_uuid")
    private String propertyUuid;

    @JsonProperty("due_date")
    @JsonDeserialize(using = TimestampDeserializser.class)
    private LocalDate dueDate;

    @JsonProperty("delay_reason")
    private String delayReason;

    
    @JsonProperty("company_name")
    private String companyName;

    @JsonProperty("contractor_name")
    private String name;

    @JsonProperty("contractor_mobile")
    private String mobile;

    @JsonProperty("office_phone")
    private String officePhone;


    @JsonProperty("site_visit_date")
    @JsonDeserialize(using = TimestampDeserializser.class)
    private LocalDate siteVisitDate;


    @JsonProperty("sitevisit_status")
    private SiteVisitStatus siteVisitStatus;


    @JsonProperty("po_number")
    private String poNumber;

    @JsonProperty("po_status")
    private POStatus poStatus;

    @JsonProperty("asis_starts_on")
    @JsonDeserialize(using = TimestampDeserializser.class)
    private LocalDate asIsStartsOn;


    @JsonProperty("asis_status")
    private AsIsStatus asIsStatus;
}
