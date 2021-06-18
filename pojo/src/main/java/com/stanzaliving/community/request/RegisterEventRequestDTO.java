package com.stanzaliving.community.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterEventRequestDTO {
    private String eventUUID;
    private String cta;
    private String description;
    private String title;
    private String bookingId;
    private String transactionStatus;
}
