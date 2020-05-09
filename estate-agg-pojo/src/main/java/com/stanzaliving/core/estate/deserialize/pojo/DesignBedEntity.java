package com.stanzaliving.core.estate.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.designservice.enums.BedType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DesignBedEntity {

    
    @JsonProperty("id")
    protected Long designId;

    
    @JsonProperty("created_at")
    protected Date createdAt;

    
    @JsonProperty("created_by")
    protected String createdBy;

    
    @JsonProperty("updated_at")
    protected Date updatedAt;

    
    @JsonProperty("updated_by")
    protected String updatedBy;

    
    @JsonProperty("status")
    protected boolean status = true;

    
    @JsonProperty("estate_uuid")
    String estateUuid;

    
    @JsonProperty("uuid")
    private String designUuid;


    
    @JsonProperty("design_file_uuid")
    private String designFileUuid;

    
    @JsonProperty("bed_type")
    private BedType bedType;

    
    @JsonProperty("total_bed_count")
    private Integer totalBedCount;

    
    @JsonProperty("design_file_path")
    private String designFilePath;

    
    @JsonProperty("design_file_name")
    private String designFileName;

    
    @JsonProperty("cad_file_path")
    private String cadFilePath;

    
    @JsonProperty("cad_file_name")
    private String cadFileName;

    
    @JsonProperty("reason")
    private String reason;
}
