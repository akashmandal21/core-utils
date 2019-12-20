package com.stanzaliving.qaservice.dto.metadata;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OnTapOptions {
    String heading;
    String imageUrl;
    List<Long> questionIds;
    
    public OnTapOptions(String heading, String imageUrl) {
        this.heading = heading;
        this.imageUrl = imageUrl;
    }
}
