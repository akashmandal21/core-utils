package com.stanzaliving.core.food.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class CsvUploadResponseDto {

    private String csvUrl;
    private long totalCount;
    private long errorCount;
    private long successCount;
    private String failedMessage;

}
