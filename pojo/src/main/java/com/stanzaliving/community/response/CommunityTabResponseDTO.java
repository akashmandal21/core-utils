package com.stanzaliving.community.response;

import com.stanzaliving.core.base.common.dto.PageResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommunityTabResponseDTO {
    private List<EventListAppDTO> moreEvent;
    private List<EventFilterCountResponseDTO> onlineOutdoorEvent;
    private  List<EventFilterCountResponseDTO> popularCategories;
}
