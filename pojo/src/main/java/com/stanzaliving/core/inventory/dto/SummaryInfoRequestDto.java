package com.stanzaliving.core.inventory.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Map;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SummaryInfoRequestDto {
    private String addressUuid;
    private Set<String> itemUuids;
    private Map<String, Set<String>> addressItemsUuidMap;
}
