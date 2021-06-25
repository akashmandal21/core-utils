package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisteredUserResponseDTO {
    private String bookingID;
    private Date createdAt;
    private String cta;
    private String description;
    private String title;
    private String transactionStatus;
    private String eventUUID;
    private String userUUID;
}
