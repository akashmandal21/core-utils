package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventFaqResponseDTO {
    private List<AddEventFaqResponseDTO> faqItems;
}
