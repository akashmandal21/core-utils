/**
 * 
 */
package com.stanzaliving.core.operations.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author manish.pareek
 *
 * @date 05-Feb-2021
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
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