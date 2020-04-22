package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.projectservice.enums.ProjectSummaryStatus;
import com.stanzaliving.core.projectservice.enums.PropertyStatus;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.GenderAllowed;
import com.stanzaliving.transformations.enums.SubBrandName;
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
public class PropertyInfoCDC {

    @JsonProperty("id")
    private Long propertyId;

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
    String propertyUuid;

    @JsonProperty("estate_uuid")
    private String estateUuid;

    @JsonProperty("estate_code")
    private String estateCode;

    @JsonProperty("leadership_property_uuid")
    private String leadershipPropertyUuid;

    @JsonProperty("propery_name")
    private String propertyName;

    @JsonProperty("estate_name")
    private String estateName;

    @JsonProperty("city_id")
    private Long cityId;

    @JsonProperty("city_name")
    private String cityName;

    @JsonProperty("micromarket_id")
    private Long micromarketId;

    @JsonProperty("micromarket_name")
    private String micromarketName;

    @JsonProperty("latitude")
    private Double latitude;

    @JsonProperty("longitude")
    private Double longitude;

    @JsonProperty("address_line_1")
    private String addressLine1;

    @JsonProperty("address_line_2")
    private String addressLine2;

    @JsonProperty("landmark")
    private String landmark;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("postal_code")
    private String postalCode;

    @JsonProperty("country")
    private String countryName;

    @JsonProperty("number_of_beds")
    private Integer numBeds;

    @JsonProperty("rent_free_days")
    private String rentFreeDays;

    @JsonProperty("num_rooms")
    private Integer numRooms;

    @JsonProperty("num_photos")
    private Integer numPhotos;

    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;

    @JsonProperty("ll_handover_date")
    private LocalDate landLordHandoverDate;

    @JsonProperty("expected_ll_handover_date")
    private LocalDate expectedLandLordHandoverDate;

    @JsonProperty("ll_handover_done")
    private boolean landlordHandedOver;

    @JsonProperty("ops_handover_date")
    private LocalDate opsHandoverDate;

    @JsonProperty("expected_ops_handover_date")
    private LocalDate expectedOpsHandoverDate;

    @JsonProperty("ops_handover_done")
    private boolean opsHandoverDone;

    @JsonProperty("live_date")
    private LocalDate liveDate;

    @JsonProperty("brand_name")
    private BrandName brandName;

    @JsonProperty("sub_brand_name")
    private SubBrandName subBrandName;

    @JsonProperty("allowed_gender")
    private GenderAllowed gender;

    @JsonProperty("total_plot_area")
    private Double totalPlotArea;

    @JsonProperty("total_property_area")
    private Double totalPropArea;

    @JsonProperty("total_premise_area")
    private Double totalPremiseArea;

    @JsonProperty("num_floors")
    private Integer numFloors;

    @JsonProperty("num_stilt_rooms")
    private Integer numberOfStiltRooms;

    @JsonProperty("property_images")
    private String propertyImages;

    @JsonProperty("site_engineer_id")
    private String siteEngineerId;

    @JsonProperty("project_manager_id")
    private String projectManagerId;

    @JsonProperty("zonal_head_id")
    private String zonalHeadId;

    @JsonProperty("gc_zonal_head_id")
    private String gcZonalHeadId;

    @JsonProperty("bd_user_id")
    private String bdUserId;

    @JsonProperty("property_status")
    private PropertyStatus propertyStatus;

    @JsonProperty("property_project_summary_status")
    private ProjectSummaryStatus projectSummaryStatus;

    @JsonProperty("sow_atl_url")
    private String sowAtlUrl;
}
