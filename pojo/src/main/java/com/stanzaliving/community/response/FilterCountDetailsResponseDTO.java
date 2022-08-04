package com.stanzaliving.community.response;

import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterCountDetailsResponseDTO {
    private List<EventFilterCountResponseDTO> eventType;
    private List<EventFilterCountResponseDTO> category;
    private PriceFilterCountResponseDTO price;
    private DateRangeResponseDTO dateRange;
}