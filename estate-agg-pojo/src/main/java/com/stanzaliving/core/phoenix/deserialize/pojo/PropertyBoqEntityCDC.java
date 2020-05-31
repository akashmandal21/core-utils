package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.agg.commons.EnumDecoder;
import com.stanzaliving.core.boq_service.enums.BoqType;
import com.stanzaliving.transformations.enums.BoqStatus;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.SubBrandName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyBoqEntityCDC {
    @JsonProperty("id")
    private Long propertyBoqId;

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
    String propertyBoqUuid;

    @JsonProperty( "property_uuid")
    private String propertyUuid;

    @JsonProperty( "city_id")
    private Long cityId;

    @JsonProperty( "city_uuid")
    private String cityUuid;

    @JsonProperty( "micromarket_id")
    private Long micromarketId;

    @JsonProperty( "city_name")
    private String cityName;

    @JsonProperty( "micromarket_name")
    private String micromarketName;

    @JsonProperty( "brand")
    private BrandName brandName;

    @JsonProperty( "sub_brand")
    private SubBrandName subBrandName;

    @JsonProperty( "room_count")
    private Integer roomCount;

    @JsonProperty( "bed_count")
    private Integer bedCount;

    @JsonProperty( "attached_washrooms_count")
    private Integer attachedWashroomsCount;

    @JsonProperty( "attached_balconies_count")
    private Integer attachedBalconiesCount;

    @JsonProperty( "boq_type")
    private String boqType; //Change BoqType to String

    @JsonProperty( "boq_pr_uuid")
    private String boqPRUuid;

    @JsonProperty( "boq_status")
    private String boqStatus;//Change BoqStatus to String

    @JsonProperty( "draft_saved")
    private Boolean draftSaved;
    
    @JsonProperty( "latest_version")
    private Integer latestVersion;

    public BoqType getBoqTypeEnum(){
        return EnumDecoder.getEnum(this.getBoqType(),BoqType.class);
    }

    public BoqStatus getBoqStatusEnum(){
        return EnumDecoder.getEnum(this.getBoqStatus(),BoqStatus.class);
    }
}
