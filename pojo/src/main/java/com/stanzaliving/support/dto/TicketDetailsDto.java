package com.stanzaliving.support.dto;

import com.stanzaliving.core.bookingservice.dto.response.BookingDurationResponseDto;
import com.stanzaliving.core.bookingservice.dto.response.RoomDetailsDto;
import com.stanzaliving.core.bookingservice.dto.response.UserDetailResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

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

    @Builder.Default
    private boolean canEdit = false;

}
