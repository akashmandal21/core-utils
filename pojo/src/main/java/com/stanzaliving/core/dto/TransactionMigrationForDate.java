package com.stanzaliving.core.dto;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionMigrationForDate {
=======
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionMigrationForDate {

>>>>>>> 8abd3c96348c25db07414cd2117405919ad1ad4c
    Date transactionDate;
}
