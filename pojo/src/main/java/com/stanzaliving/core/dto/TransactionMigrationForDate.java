package com.stanzaliving.core.dto;

import lombok.*;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionMigrationForDate {

    Date transactionDate;
}
