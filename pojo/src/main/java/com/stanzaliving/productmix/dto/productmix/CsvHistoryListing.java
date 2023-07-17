package com.stanzaliving.productmix.dto.productmix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CsvHistoryListing {

    private String uuid;

    private String uploadedBy;

    private Long uploadedAt;

    private int roomsUploaded;

    private String filePath;
}
