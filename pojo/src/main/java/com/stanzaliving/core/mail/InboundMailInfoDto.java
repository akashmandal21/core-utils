package com.stanzaliving.core.mail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InboundMailInfoDto {

    private String to;

    private String from;

    private String body;

    private String subject;

    private String messageId;

    private String inReplyTo;

}
