package com.stanzaliving.support.dto;

import com.stanzaliving.core.dto.PageAndSortDto;
import com.stanzaliving.support.enums.TicketType;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRuleFilterDto extends PageAndSortDto {
    private TicketType ticketType;
    private List<String> createdBy;
    private List<String> lastUpdatedBy;
    private Boolean isActive;
    private List<String> city;
    private List<String> micromarket;
    private List<String> residence;
    private List<String> complaintGroup;
    private List<String> category;
    private List<String> subcategory;
    private List<String> subTicketTask;
    private String search;
}
