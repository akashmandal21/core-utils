package com.stanzaliving.productmix.dto.productmix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomCsvResponseDto {
    private int totalItems;

    private int itemsUploaded;

    private String heading;

    private String title;

    private String subTitle;
}
