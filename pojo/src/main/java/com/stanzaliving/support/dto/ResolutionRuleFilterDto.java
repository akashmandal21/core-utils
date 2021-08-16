package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.TicketType;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRuleFilterDto {
    @NotNull(message = "Ticket type must not be null.")
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


}
