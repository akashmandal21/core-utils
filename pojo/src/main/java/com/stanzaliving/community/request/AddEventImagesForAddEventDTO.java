package com.stanzaliving.community.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEventImagesForAddEventDTO {

    private String imageUrl;

    private Long imageOrder;

    private boolean isFeatured;

}