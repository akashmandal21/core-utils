package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.TicketRaisedForType;
import com.stanzaliving.core.bookingservice.dto.response.BookingDurationResponseDto;
import com.stanzaliving.core.bookingservice.dto.response.RoomDetailsDto;
import com.stanzaliving.core.bookingservice.dto.response.UserDetailResponseDto;
import com.stanzaliving.support.enums.TicketSource;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class TicketDetailsDto {

    private String assignedToUuid;

    private String assignedTo;

    private List<SubTicketDto> subTicketDtoList;

    private List<TicketChecklistDetailDto> ticketChecklistDetailDtoList;

    private List<TagDto> tagDtoList;

    private TicketCardDto ticketCardDtoList;

    private TeamDto teamDto;

    private UserDetailResponseDto userDetailResponseDto;
    
    private UserDto ticketCreatedByUserDetailDto;

    private BookingDurationResponseDto bookingDurationResponseDto;

    private RoomDetailsDto roomDetailsDto;

    private ResidentRelationDto residentRelationDto;
    
    private TicketRaisedForType raisedForType;

    @Builder.Default
    private boolean canEdit = false;

    @Builder.Default
    private boolean isFreeTextAccess = true;

    private List<TicketFilterCountDto> ticketFilterCountDtos;

    private boolean isAllChecklistClosed;

    private TicketSource ticketSource;

    private String linkedTo;

    private TicketType ticketType;
}
