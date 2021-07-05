package com.stanzaliving.community.request;

import com.stanzaliving.community.enums.TransactionStatus;
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
    private String bookingId;
    private TransactionStatus transactionStatus;
}
