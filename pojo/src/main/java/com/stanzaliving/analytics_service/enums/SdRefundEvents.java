package com.stanzaliving.analytics_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SdRefundEvents {
    SD_REFUND_INITIATED("SD_refund_initiated"),
    SD_REFUND_AUDIT_SCHEDULED("SD_refund_audit_scheduled"),
    SD_REFUND_AUDIT_RESCHEDULED("SD_refund_audit_rescheduled"),
    SD_REFUND_AUDIT_PROCESSED("SD_refund_audit_processed"),
    SD_REFUND_AUDIT_APPROVED("SD_refund_audit_approved"),
    SD_REFUND_TRANSFER_APPLICABLE("SD_refund_transfer_applicable"),
    SD_REFUND_ACCOUNT_DETAILS_UPDATED("SD_refund_account_details_updated"),
    SD_REFUND_TRANSFER_INITIATED("SD_refund_transfer_initiated"),
    SD_REFUND_TRANSFER_PROCESSED("SD_refund_transfer_processed"),
    SUCCESS("Success"),
    FAILED("Failed"),
    INITIATED("Initiated");
    private final String events;
}
