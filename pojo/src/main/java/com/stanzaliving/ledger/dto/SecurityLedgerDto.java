package com.stanzaliving.ledger.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SecurityLedgerDto {
    @JsonSetter("CREDIT")
    private Double credit;
    @JsonSetter("DEBIT")
    private Double debit;
    @JsonSetter("ID")
    private int id;
    @JsonSetter("BALANCE")
    private Double balance;
    @JsonSetter("SECURITY_LEDGER_TYPE")
    private String securityLedgerType;
    @JsonSetter("NARRATION")
    private String narration;
    @JsonSetter("CREATED")
    private String created;
    @JsonSetter("UPDATED")
    private String updated;
    @JsonSetter("BOOKING_ID")
    private String bookingId;


}
