package com.stanzaliving.ledger.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class RentalLedgerDto {
    @JsonSetter("CREDIT")
    private Double credit;
    @JsonSetter("DEBIT")
    private Double debit;
    @JsonSetter("ID")
    private int id;
    @JsonSetter("BALANCE")
    private Double balance;
    @JsonSetter("ADVANCE_RENTAL_LEDGER_TYPE")
    private String advanceRentalLedgerType;
    @JsonSetter("NARRATION")
    private String narration;
    @JsonSetter("CREATED")
    private String created;
    @JsonSetter("UPDATED")
    private String updated;
    @JsonSetter("BOOKING_ID")
    private String bookingId;
    @JsonSetter("FROM_DATE")
    private String fromDate;
    @JsonSetter("TO_DATE")
    private String toDate;

}
