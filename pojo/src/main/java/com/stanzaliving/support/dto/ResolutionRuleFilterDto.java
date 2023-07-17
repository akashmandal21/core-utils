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
    @NotNull(message="city cannot be null")
    private List<String> city;
    @NotNull(message="micromarket cannot be null")
    private List<String> micromarket;
    @NotNull(message="residence cannot be null")
    private List<String> residence;
    private List<String> complaintGroup;
    private List<String> category;
    private List<String> subCategory;
    private List<String> subTicketTask;
    private String search;
}
