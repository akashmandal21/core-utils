package com.stanzaliving.community.request;

import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventFilterDTO {
    private List<String> eventType;
    private List<String> eventCategory;
    private List<String> status;
    private String venueType;
    private List<String> eventOrganizer;
    private UserListDTO userList;
    private Date initialStartDate;
    private Date initialEndDate;
    private Date finalStartDate;
    private Date finalEndDate;
}

