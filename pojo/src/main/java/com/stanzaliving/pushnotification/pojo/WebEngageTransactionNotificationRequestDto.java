package com.stanzaliving.pushnotification.pojo;

import lombok.*;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class WebEngageTransactionNotificationRequestDto {
    private String accountId;       //not required if absolute url is given in StanzaRestClient
    private String campaignId;      //not required if absolute url is given in StanzaRestClient
    private String userId;
    private Map<String, String> overrideData;
    private Integer ttl;
}
