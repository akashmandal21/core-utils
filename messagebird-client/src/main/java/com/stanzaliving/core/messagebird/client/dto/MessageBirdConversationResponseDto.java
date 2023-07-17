package com.stanzaliving.core.messagebird.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageBirdConversationResponseDto {

    private String id;
    private String conversationId;
    private String type;
    private HsmMessageDto content;
    private String contactId;
    private String status;
    private String createdDatetime;
    private String updatedDatetime;
}
