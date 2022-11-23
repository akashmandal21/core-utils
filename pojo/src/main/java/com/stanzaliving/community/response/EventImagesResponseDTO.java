package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventImagesResponseDTO {
    private Long id;
    private String uuid;

    private String imageUrl;

    private Long imageOrder;

    private Boolean isFeatured;

}