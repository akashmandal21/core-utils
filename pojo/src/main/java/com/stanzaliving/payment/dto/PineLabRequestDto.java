package com.stanzaliving.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PineLabRequestDto {
    int ResponseCode;
    String ResponseMessage;
    String transaction;
    String PlutusTransactionReferenceID;
    String TransactionNumber;
    String BankTID;
    String BankMID;
    String PaymenMode;
    Double Amount;
    String ApprovalCode;
    String RRN;
    String Invoice;
    String BatchNumber;
    String CardNumber;
    String ExpiryDate;
    String AcquirerCode;
    String AcquirerName;
    String TransactionDate;
    String TransactionTime;
    String CardType;

    @Override
    public String toString() {
        return "PineLabRequestDto{" +
                "ResponseCode=" + ResponseCode +
                ", ResponseMessage='" + ResponseMessage + '\'' +
                ", transaction='" + transaction + '\'' +
                ", PlutusTransactionReferenceID='" + PlutusTransactionReferenceID + '\'' +
                ", TransactionNumber='" + TransactionNumber + '\'' +
                ", BankTID='" + BankTID + '\'' +
                ", BankMID='" + BankMID + '\'' +
                ", PaymenMode='" + PaymenMode + '\'' +
                ", Amount=" + Amount +
                ", ApprovalCode='" + ApprovalCode + '\'' +
                ", RRN='" + RRN + '\'' +
                ", Invoice='" + Invoice + '\'' +
                ", BatchNumber='" + BatchNumber + '\'' +
                ", CardNumber='" + CardNumber + '\'' +
                ", ExpiryDate='" + ExpiryDate + '\'' +
                ", AcquirerCode='" + AcquirerCode + '\'' +
                ", AcquirerName='" + AcquirerName + '\'' +
                ", TransactionDate='" + TransactionDate + '\'' +
                ", TransactionTime='" + TransactionTime + '\'' +
                ", CardType='" + CardType + '\'' +
                '}';
    }
}