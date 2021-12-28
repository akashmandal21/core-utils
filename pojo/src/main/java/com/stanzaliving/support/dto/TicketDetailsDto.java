package com.stanzaliving.support.dto;

import com.stanzaliving.core.bookingservice.dto.response.BookingDurationResponseDto;
import com.stanzaliving.core.bookingservice.dto.response.RoomDetailsDto;
import com.stanzaliving.core.bookingservice.dto.response.UserDetailResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDetailsDto {

    private String assignedToUuid;

    private String assignedTo;

    private List<SubTicketDto> subTicketDtoList;

    private List<TicketChecklistDetailDto> ticketChecklistDetailDtoList;

    private List<TagDto> tagDtoList;

    private TicketCardDto ticketCardDtoList;

    private TeamDto teamDto;

    private UserDetailResponseDto userDetailResponseDto;

    private BookingDurationResponseDto bookingDurationResponseDto;

    private RoomDetailsDto roomDetailsDto;

    private ResidentRelationDto residentRelationDto;

    @Builder.Default
    private boolean canEdit = false;

    @Builder.Default
    private boolean canReply = true;

}
