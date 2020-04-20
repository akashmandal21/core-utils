package com.stanzaliving.qaservice.dto.metadata;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OnTapOptions {
    String id;
    String heading;
    String subHeading;
    String imageUrl;
    List<Long> questionIds;
    
    public OnTapOptions(String heading, String imageUrl) {
        this.heading = heading;
        this.imageUrl = imageUrl;
    }
}
