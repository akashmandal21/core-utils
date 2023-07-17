package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRuleAddDto {
    private String groupUuid;
    @NotEmpty(message = "select at least one subCategory.")
    @Valid
    private List<String> primaryReferenceUuid;
    @NotNull(message = "ticket type can't be left blank.")
    private TicketType ticketType;
    private List<String> city;
    private List<String> micromarket;
    private List<String> residence;
    private List<String> propertyDealType;
    @NotEmpty(message = "resolutionRole can't be left blank.")
    @Valid
    private List<ResolutionRoleDto> resolutionRole;
    @NotEmpty(message = "reminder rules can't be left blank.")
    @Valid
    private List<ReminderDetailsDto> reminderDetails;
}

