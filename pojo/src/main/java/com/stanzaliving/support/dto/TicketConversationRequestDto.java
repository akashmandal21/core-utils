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

    private String message;

    @NotNull(message = "Make the message public or private")
    private Boolean isPrivate;

    @Builder.Default
    private boolean fromSupport = false;

    // we send reply mail to customer only if this field is true
    @Builder.Default
    private Boolean isMailReplyRequired = Boolean.TRUE;

}
