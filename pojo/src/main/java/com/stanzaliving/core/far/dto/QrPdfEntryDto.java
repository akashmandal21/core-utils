package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.AssetAllocatedTo;
import com.stanzaliving.core.far.enums.AssetLocatedIn;
import com.stanzaliving.core.far.enums.OtherArea;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QrPdfEntryDto {
    private String itemUrl;
    private String itemName;
}
