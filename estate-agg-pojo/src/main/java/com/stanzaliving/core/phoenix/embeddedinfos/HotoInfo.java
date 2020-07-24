package com.stanzaliving.core.phoenix.embeddedinfos;

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
public class HotoInfo {
    String hotoUuid;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private HOTODocumentStatus hotoDocumentStatus;
    private String filePath;
    private String signedFilePath;
}
