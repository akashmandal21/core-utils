package com.stanzaliving.estate_v2.dto.reviewTemplate;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageResponse implements LayoutData{
    private List<ItemResponse> items;
}
