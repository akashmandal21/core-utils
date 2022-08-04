package com.stanzaliving.core.food.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class CsvUploadResponseDto {

    private String csvUrl;
    private long totalCount;
    private long errorCount;
    private long successCount;
    
    public String getMessage() {
        
        if(this.totalCount==0l) {
            return "No records found in the upload request";
        } else if(totalCount==successCount) {
            return "File uploaded successfully";
        } else if(totalCount==errorCount) {
            return "File uploaded failed";
        } else {
            return "Some records have been uploaded";
        }
        
    }

}
