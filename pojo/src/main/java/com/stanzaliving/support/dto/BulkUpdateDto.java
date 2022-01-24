package com.stanzaliving.support.dto;
import com.stanzaliving.support.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BulkUpdateDto {

    private List<String> ticketUuids;

    private String subCategoryUuid;

    private List<TagDto> tagDtoList;

    private Priority priority;

    private String message;

    private String statusUuid;

}
