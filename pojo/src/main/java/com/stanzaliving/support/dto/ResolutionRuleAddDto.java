package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRuleAddDto {
    @NotEmpty(message = "primary reference uuid can't be left blank.")
    private List<String> primaryReferenceUuid;
    @NotNull(message = "ticket type can't be left blank.")
    private TicketType ticketType;
    @NotEmpty(message = "city can't be left blank.")
    private List<String> city;
    @NotEmpty(message = "micromarket can't be left blank.")
    private List<String> micromarket;
    @NotEmpty(message = "residence can't be left blank.")
    private List<String> residence;
    @NotEmpty(message = "resolutionRole can't be left blank.")
    private List<ResolutionRoleDto> resolutionRole;

}

