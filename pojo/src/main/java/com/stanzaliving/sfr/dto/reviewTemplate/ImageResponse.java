package com.stanzaliving.sfr.dto.reviewTemplate;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageResponse implements LayoutData {
    private List<ItemResponse> items;
}
