package com.stanzaliving.core.mail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OutboundMailInfoDto {

    private String from;

    private String to;

    private String body;

    private String subject;

    private String messageId;

    private String inReplyTo;

    private boolean isHtml;

}
