/**
 * 
 */
package com.stanzaliving.core.operations.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author manish.pareek
 *
 * @date 05-Feb-2021
 */
@Getter
@AllArgsConstructor
public enum DealStatus {
    UNDER_DRAFT("Under Draft"), 
    SUBMITTED("Submitted"), 
    CANCELLED("Cancelled"),
    APPROVED("Approved"), 
    ON_HOLD("On Hold"),
    EXPIRED("Expired"),
    REJECTED("Rejected"); 

   private String dealStatus;
}