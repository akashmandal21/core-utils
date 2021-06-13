package com.stanzaliving.community.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventLocationDTO {
    private List<String> city;

    private List<String> microMarket;

    private List<String> residence;
}
