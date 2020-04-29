/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class ListingResponseDto {

	private int recordCount;
	private long totalRecordCount;
	private int currentPage;
	private int totalPages;
	private int pendingL1ApprovalCount;
	private int pendingPropertyNamingCount;
	private int pendingSandeepApprovalCount;
	private int pendingLegalApprovalCount;
	private int pendingNHL1ApprovalCount;
	private int pendingNHL2ApprovalCount;
	private int pendingTransformationApprovalCount;
	private List<ListingDto> propertyListing;
}
