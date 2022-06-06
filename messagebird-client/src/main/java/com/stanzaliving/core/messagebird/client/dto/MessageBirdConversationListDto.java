package com.stanzaliving.core.messagebird.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageBirdConversationListDto {

    private List<MessageBirdConversationResponseDto> items;
}
