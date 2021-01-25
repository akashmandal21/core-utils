package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.projectservice.enums.HOTODocumentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotoDocHouseDetailsCDC {

    @JsonProperty("id")
    private Long hotoDocumentDetailsId;

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
    String hotoDocumentDetailsUuid;

    @JsonProperty("house_uuid")
    private String propertyUuid;

    @JsonProperty("house_name")
    private String houseName;

    @JsonProperty("micromarket_uuid")
    private String micromarketUuid;

    @JsonProperty("micromarket_name")
    private String micromarketName;

    @JsonProperty("city_uuid")
    private String cityUuid;

    @JsonProperty("city_name")
    private String cityName;

    @JsonProperty("hoto_status")
    private String hotoDocumentStatus; //Change HOTODocumentStatus to String

    @JsonProperty("file_path")
    private String filePath;

    @JsonProperty("signed_file_path")
    private String signedFilePath;
}
