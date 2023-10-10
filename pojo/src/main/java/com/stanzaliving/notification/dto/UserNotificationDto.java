package com.stanzaliving.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserNotificationDto {

   private String uuid;

   private String campaignId;

   private String title;

   private String message;

   private String callToActionUrl;

   private String imageUrl;

   private Date createdAt;

   private  Map<String,String> payloadData;

   private boolean isSubmitted;

   boolean isCampaignLive;

   Date clickedAt;
}
