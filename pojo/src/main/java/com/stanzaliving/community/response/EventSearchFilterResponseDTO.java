package com.stanzaliving.community.response;

import com.stanzaliving.community.enums.EventStatus;
import com.stanzaliving.community.enums.UserList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventSearchFilterResponseDTO {
    private String eventId;
    private String eventName;
    private String eventType;
    private String eventCategory;
    private Date eventStartDate;
    private String createdBy;
    private Date updatedAt;
    private UserListResponseDTO userList;
    private Long priorityOrder;
    private EventStatus eventStatus;
    private String uuid;
}
