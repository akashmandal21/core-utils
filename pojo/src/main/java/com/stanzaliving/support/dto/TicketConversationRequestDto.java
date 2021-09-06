package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketConversationRequestDto {

    @NotBlank(message = "Message cannot be empty")
    private String message;

    @NotNull(message = "Make the message public or private")
    private Boolean isPrivate;
}
