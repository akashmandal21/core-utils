package com.stanzaliving.survey.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserFeedBackResponse {

    private String userId;

    private String eventCategory;

    private Boolean isCafe;

    private String eventName;

    private Date eventTime;

    private String eventData;

    private String orderId;

    private Date feedbackTime;

}