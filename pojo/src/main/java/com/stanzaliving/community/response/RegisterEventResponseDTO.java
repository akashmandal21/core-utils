package com.stanzaliving.community.response;

import com.stanzaliving.community.enums.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterEventResponseDTO {

    private String bookingID;
    private Date createdAt;
    private TransactionStatus transactionStatus;
    private String eventUUID;
    private String userUUID;
    private EventResponseAppDTO eventDetails;
}
