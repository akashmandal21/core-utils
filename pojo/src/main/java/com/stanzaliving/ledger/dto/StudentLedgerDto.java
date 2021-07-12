package com.stanzaliving.ledger.dto;


import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class StudentLedgerDto {
    @JsonSetter("CREDIT")
    private Double credit;
    @JsonSetter("DEBIT")
    private Double debit;
    @JsonSetter("LEDGER_ID")
    private int ledgerId;
    @JsonSetter("BALANCE")
    private Double balance;
    @JsonSetter("TYPE")
    private String type;
    @JsonSetter("CREATED")
    private String created;
    @JsonSetter("BOOKING_ID")
    private String bookingId;

}
