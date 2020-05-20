/**
 * 
 */
package com.stanzaliving.core.estate.utils;

import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.leadership.dto.ColorCodeDto;

import lombok.experimental.UtilityClass;

/**
 * @author raj.kumar
 *
 */
@UtilityClass
public class EstateStatusColorCodeUtil {

	public static Map<EstateStatus, ColorCodeDto> getEstateColorCode() {

		Map<EstateStatus, ColorCodeDto> colorCodeMap = new HashMap<>();

		colorCodeMap.put(EstateStatus.DRAFT_IN_PROGRESS, 
				new ColorCodeDto("#3F3F3F", "#E5E5E5", "Under Draft",""));
		colorCodeMap.put(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD, 
				new ColorCodeDto("#4B87E3", "#E4EDFB", "Regional Manager For L1",""));
		colorCodeMap.put(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES,
				new ColorCodeDto("#4B87E3", "#E4EDFB", "Regional Manager For L1 & Design",""));
		colorCodeMap.put(EstateStatus.SENT_BACK_BY_CITY_HEAD, 
				new ColorCodeDto("#3F3F3F", "#E5E5E5", "Regional Manager From L1",""));
		colorCodeMap.put(EstateStatus.PENDING_DESIGN_FILES, 
				new ColorCodeDto("#4B87E3", "#E4EDFB", "Pending Design Files",""));
		colorCodeMap.put(EstateStatus.PENDING_INITIAL_BED_COUNT, 
				new ColorCodeDto("#02658B", "#CCE9F4", "Design For Bed Count",""));
		colorCodeMap.put(EstateStatus.SENT_BACK_FROM_INITIAL_BED_COUNT, 
				new ColorCodeDto("#3F3F3F", "#E5E5E5", "Design From Bed Count",""));
		colorCodeMap.put(EstateStatus.SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD, 
				new ColorCodeDto("#7F5401", "#FEECCD", "National Head For L1","L1 Approval"));
		colorCodeMap.put(EstateStatus.SENT_BACK_L1_BY_NATIONAL_HEAD, 
				new ColorCodeDto("#3F3F3F", "#E5E5E5", "National Head From L1",""));
		colorCodeMap.put(EstateStatus.SENT_FOR_L1_APPROVAL_TO_LEADERSHIP, 
				new ColorCodeDto("#9403BC", "#EFC5FA", "Andy For L1","L1 Approval"));
		colorCodeMap.put(EstateStatus.SENT_BACK_L1_BY_LEADERSHIP, 
				new ColorCodeDto("#3F3F3F", "#E5E5E5", "Andy From L1",""));
		colorCodeMap.put(EstateStatus.APPROVED_L1_BY_LEADERSHIP, 
				new ColorCodeDto("#0B6550", "#CAFFF3", "Pending L2 Details",""));
		colorCodeMap.put(EstateStatus.SENT_FOR_APPROVAL, 
				new ColorCodeDto("#0002CF", "#C1C3FF", "NH & TH For L2",""));
		colorCodeMap.put(EstateStatus.SENT_BACK, 
				new ColorCodeDto("#5C49A2", "#E7E4F1", "National Head From L2",""));
		colorCodeMap.put(EstateStatus.APPROVED_BY_NATIONAL_HEAD, 
				new ColorCodeDto("#0002CF", "#C1C3FF", "Transformation Head","SOW Approval"));
		colorCodeMap.put(EstateStatus.SENT_BACK_BY_TRANSFORMATION, 
				new ColorCodeDto("#5C49A2", "#E7E4F1","Transformation Head",""));
		colorCodeMap.put(EstateStatus.APPROVED_BY_TRANSFORMATION, 
				new ColorCodeDto("#0002CF", "#C1C3FF", "National Head For L2","L2 Approval"));
		colorCodeMap.put(EstateStatus.SENT_FOR_SANDEEP_APPROVAL, 
				new ColorCodeDto("#9A6E4E", "#FEECD3", "Sandeep","SOW Approval"));
		colorCodeMap.put(EstateStatus.SENT_BACK_BY_SANDEEP, 
				new ColorCodeDto("#5C49A2", "#E7E4F1", "Sandeep",""));
		colorCodeMap.put(EstateStatus.SENT_TO_LEGAL, 
				new ColorCodeDto("#790A00", "#FAD1CC", "Legal","Language Deviations"));
		colorCodeMap.put(EstateStatus.SENT_BACK_BY_LEGAL, 
				new ColorCodeDto("#5C49A2", "#E7E4F1", "Legal",""));
		colorCodeMap.put(EstateStatus.ATL_UPLOAD_PENDING, 
				new ColorCodeDto("#F5413B", "#FFDEB4", "Pending ATL Upload",""));
		colorCodeMap.put(EstateStatus.SIGNED_ATL_UPLOADED, 
				new ColorCodeDto("#898F07", "#F1F3C2", "Andy For Naming","Naming"));
		colorCodeMap.put(EstateStatus.SENT_BACK_BY_LEADERSHIP, 
				new ColorCodeDto("#5C49A2", "#E7E4F1", "Andy From Naming",""));
		colorCodeMap.put(EstateStatus.APPROVED_BY_LEADERSHIP, 
				new ColorCodeDto("#2F9A34", "#C9E6CA", "Property Naming Done",""));
		colorCodeMap.put(EstateStatus.DROPPED_REQUESTED, 
				new ColorCodeDto("#2F9A34", "#C9E6CA", "Property Drop Request Raised","Property Drop Request Raised"));
		colorCodeMap.put(EstateStatus.DROPPED, 
				new ColorCodeDto("#2F9A34", "#C9E6CA", "Property Dropped","Property Dropped"));
		colorCodeMap.put(EstateStatus.CALLBACK_TO_UNDER_DRAFT, 
				new ColorCodeDto("#2F9A34", "#C9E6CA", "Call Back Requested For Under Draft","Call Back Requested For Under Draft"));
		colorCodeMap.put(EstateStatus.CALLBACK_TO_L1_APPROVED, 
				new ColorCodeDto("#2F9A34", "#C9E6CA", "Call Back Requested For L1 Approved","Callback Request To L1"));
		
	    return colorCodeMap;

	}

	public static String getEstateTextColorCode(EstateStatus estateStatus) {

		Map<EstateStatus, ColorCodeDto> estateColorCode = getEstateColorCode();

		if (estateColorCode.get(estateStatus) != null) {
			return estateColorCode.get(estateStatus).getTextColorCode();
		}

		return null;
	}

	public static String getEstateTaskHeading(EstateStatus estateStatus) {

		Map<EstateStatus, ColorCodeDto> estateColorCode = getEstateColorCode();

		if (estateColorCode.get(estateStatus) != null) {
			return estateColorCode.get(estateStatus).getTaskHeading();
		}

		return null;
	}
	
	public static String getEstateBackgroundColorCode(EstateStatus estateStatus) {

		Map<EstateStatus, ColorCodeDto> estateColorCode = getEstateColorCode();

		if (estateColorCode.get(estateStatus) != null) {
			return estateColorCode.get(estateStatus).getBackgroundColorCode();
		}

		return null;
	}
	
	public static String getEstateStatusCustomName(EstateStatus estateStatus) {

		Map<EstateStatus, ColorCodeDto> estateColorCode = getEstateColorCode();
		
		if (estateColorCode.get(estateStatus) != null) {
			return estateColorCode.get(estateStatus).getEstateDesc();
		}
		
		return null;
	}
}
