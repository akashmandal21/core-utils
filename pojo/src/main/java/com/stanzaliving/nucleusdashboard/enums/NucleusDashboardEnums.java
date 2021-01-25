package com.stanzaliving.nucleusdashboard.enums;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.tuple.Pair;

import com.stanzaliving.core.estate.enums.EstateStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NucleusDashboardEnums {
	preL1Approval,
	RM_LEVEL,
	DESIGN_LEVEL,
	NH_LEVEL,
	AD_LEVEL,
	preL2Approval,
	ONLY_L1_APPROVED,
	L1_APPROVED_AND_TH_REJECT,
	L1_APPROVED_AND_NH_REJECT,
	L1_APPROVED_AND_LEGAL_REJECT,
	NH_APPROVED_AND_AWAITING_TH,
	NH_APPROVED_AND_AWAITING_NH,
	AWAITING_NH_AND_TH_APPROVAL,
	AWAITING_LEGAL_APPROVAL,
	AWAITING_SANDEEP_APPROVAL,
	
	
	postATLGeneration,
	LEGAL_REVIEW_AWAITED,
	ATL_SIGNED_NAMING_AWAITED,
	ATL_GENERATED_BUT_NOT_SIGNED,
	
	propertyNamed,
	PROPERTY_NAMED,
	
	//JSON response key
	TOTAL,
	TOTAL_PROPERTIES; //

	static Map<EstateStatus,Pair<String, String>> mapPair = new HashMap<EstateStatus, Pair<String,String>>();
	
	static Map<NucleusDashboardEnums,List<EstateStatus>> nucleusDashboardCategories = new HashMap<>();
	
	
	static{
		// preL1Approval
		mapPair.put(EstateStatus.DRAFT_IN_PROGRESS, Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.RM_LEVEL.toString()));
		mapPair.put(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES , Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.RM_LEVEL.toString()));
		mapPair.put(EstateStatus.SENT_BACK_FROM_INITIAL_BED_COUNT , Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.RM_LEVEL.toString()));
		mapPair.put(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD, Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.RM_LEVEL.toString()));
		mapPair.put(EstateStatus.SENT_BACK_BY_CITY_HEAD, Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.RM_LEVEL.toString()));
		mapPair.put(EstateStatus.SENT_BACK_L1_BY_NATIONAL_HEAD, Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.RM_LEVEL.toString()));
		mapPair.put(EstateStatus.SENT_BACK_L1_BY_LEADERSHIP, Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.RM_LEVEL.toString()));
		mapPair.put(EstateStatus.PENDING_DESIGN_FILES, Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.RM_LEVEL.toString()));
		
		mapPair.put(EstateStatus.PENDING_INITIAL_BED_COUNT, Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.DESIGN_LEVEL.toString()));
		
		mapPair.put(EstateStatus.APPROVED_BY_CITY_HEAD, Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.NH_LEVEL.toString()));
		mapPair.put(EstateStatus.SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD, Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.NH_LEVEL.toString()));
		
		mapPair.put(EstateStatus.SENT_FOR_L1_APPROVAL_TO_LEADERSHIP, Pair.of(NucleusDashboardEnums.preL1Approval.toString(), NucleusDashboardEnums.AD_LEVEL.toString()));
		
		
		nucleusDashboardCategories.put(RM_LEVEL, Arrays.asList(EstateStatus.DRAFT_IN_PROGRESS,EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD,
				EstateStatus.SENT_BACK_BY_CITY_HEAD,EstateStatus.SENT_BACK_L1_BY_NATIONAL_HEAD, EstateStatus.SENT_BACK_L1_BY_LEADERSHIP,EstateStatus.PENDING_DESIGN_FILES,EstateStatus.SENT_BACK_FROM_INITIAL_BED_COUNT,EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES));
		nucleusDashboardCategories.put(DESIGN_LEVEL, Arrays.asList(EstateStatus.PENDING_INITIAL_BED_COUNT));
		nucleusDashboardCategories.put(NH_LEVEL, Arrays.asList(EstateStatus.APPROVED_BY_CITY_HEAD,EstateStatus.SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD));
		nucleusDashboardCategories.put(AD_LEVEL, Arrays.asList(EstateStatus.SENT_FOR_L1_APPROVAL_TO_LEADERSHIP));
		nucleusDashboardCategories.put(preL1Approval, Stream.of(nucleusDashboardCategories.get(RM_LEVEL), nucleusDashboardCategories.get(DESIGN_LEVEL),nucleusDashboardCategories.get(NH_LEVEL), nucleusDashboardCategories.get(AD_LEVEL))
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
		
		
		
		
		
		//preL2Approval
		mapPair.put(EstateStatus.APPROVED_L1_BY_LEADERSHIP, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.ONLY_L1_APPROVED.toString()));
		mapPair.put(EstateStatus.SENT_BACK_BY_SANDEEP, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.ONLY_L1_APPROVED.toString()));
		mapPair.put(EstateStatus.SENT_BACK_BY_LEADERSHIP, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.ONLY_L1_APPROVED.toString()));
		mapPair.put(EstateStatus.SENT_BACK_BY_TRANSFORMATION, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.L1_APPROVED_AND_TH_REJECT.toString()));
		mapPair.put(EstateStatus.SENT_BACK, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.L1_APPROVED_AND_NH_REJECT.toString()));
		mapPair.put(EstateStatus.SENT_BACK_BY_LEGAL, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.L1_APPROVED_AND_LEGAL_REJECT.toString()));
		mapPair.put(EstateStatus.APPROVED_BY_NATIONAL_HEAD, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.NH_APPROVED_AND_AWAITING_TH.toString()));
		mapPair.put(EstateStatus.APPROVED_BY_TRANSFORMATION, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.NH_APPROVED_AND_AWAITING_NH.toString()));
		mapPair.put(EstateStatus.SENT_FOR_APPROVAL, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.AWAITING_NH_AND_TH_APPROVAL.toString()));
		mapPair.put(EstateStatus.SENT_TO_LEGAL, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.AWAITING_LEGAL_APPROVAL.toString()));
		mapPair.put(EstateStatus.SENT_FOR_SANDEEP_APPROVAL, Pair.of(NucleusDashboardEnums.preL2Approval.toString(), NucleusDashboardEnums.AWAITING_SANDEEP_APPROVAL.toString()));
		
		
		nucleusDashboardCategories.put(ONLY_L1_APPROVED, Arrays.asList(EstateStatus.APPROVED_L1_BY_LEADERSHIP,EstateStatus.SENT_BACK_BY_SANDEEP,EstateStatus.SENT_BACK_BY_LEADERSHIP));
		nucleusDashboardCategories.put(L1_APPROVED_AND_TH_REJECT, Arrays.asList(EstateStatus.SENT_BACK_BY_TRANSFORMATION));
		nucleusDashboardCategories.put(L1_APPROVED_AND_NH_REJECT, Arrays.asList(EstateStatus.SENT_BACK));
		nucleusDashboardCategories.put(L1_APPROVED_AND_LEGAL_REJECT, Arrays.asList(EstateStatus.SENT_BACK_BY_LEGAL));
		nucleusDashboardCategories.put(NH_APPROVED_AND_AWAITING_TH, Arrays.asList(EstateStatus.APPROVED_BY_NATIONAL_HEAD));
		nucleusDashboardCategories.put(NH_APPROVED_AND_AWAITING_NH, Arrays.asList(EstateStatus.APPROVED_BY_TRANSFORMATION));
		nucleusDashboardCategories.put(AWAITING_NH_AND_TH_APPROVAL, Arrays.asList(EstateStatus.SENT_FOR_APPROVAL));
		nucleusDashboardCategories.put(AWAITING_LEGAL_APPROVAL, Arrays.asList(EstateStatus.SENT_TO_LEGAL));
		nucleusDashboardCategories.put(AWAITING_SANDEEP_APPROVAL, Arrays.asList(EstateStatus.SENT_FOR_SANDEEP_APPROVAL));
		
		nucleusDashboardCategories.put(preL2Approval, Stream.of(nucleusDashboardCategories.get(ONLY_L1_APPROVED), nucleusDashboardCategories.get(L1_APPROVED_AND_TH_REJECT), 
				nucleusDashboardCategories.get(L1_APPROVED_AND_NH_REJECT),nucleusDashboardCategories.get(L1_APPROVED_AND_LEGAL_REJECT),
				nucleusDashboardCategories.get(NH_APPROVED_AND_AWAITING_TH),nucleusDashboardCategories.get(NH_APPROVED_AND_AWAITING_NH),
				nucleusDashboardCategories.get(AWAITING_NH_AND_TH_APPROVAL),nucleusDashboardCategories.get(AWAITING_LEGAL_APPROVAL),
				nucleusDashboardCategories.get(AWAITING_SANDEEP_APPROVAL))
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
		
		
		
		
		
		//postAtlGeneration
		mapPair.put(EstateStatus.SENT_TO_LEGAL, Pair.of(NucleusDashboardEnums.postATLGeneration.toString(), NucleusDashboardEnums.LEGAL_REVIEW_AWAITED.toString()));
		mapPair.put(EstateStatus.SENT_TO_CENTRAL_BD_TEAM, Pair.of(NucleusDashboardEnums.postATLGeneration.toString(), NucleusDashboardEnums.LEGAL_REVIEW_AWAITED.toString()));
		mapPair.put(EstateStatus.SIGNED_ATL_UPLOADED, Pair.of(NucleusDashboardEnums.postATLGeneration.toString(), NucleusDashboardEnums.ATL_SIGNED_NAMING_AWAITED.toString()));
		mapPair.put(EstateStatus.ATL_UPLOAD_PENDING, Pair.of(NucleusDashboardEnums.postATLGeneration.toString(), NucleusDashboardEnums.ATL_GENERATED_BUT_NOT_SIGNED.toString()));

		nucleusDashboardCategories.put(LEGAL_REVIEW_AWAITED, Arrays.asList(EstateStatus.SENT_TO_LEGAL, EstateStatus.SENT_TO_CENTRAL_BD_TEAM));
		nucleusDashboardCategories.put(ATL_SIGNED_NAMING_AWAITED, Arrays.asList(EstateStatus.SIGNED_ATL_UPLOADED));
		nucleusDashboardCategories.put(ATL_GENERATED_BUT_NOT_SIGNED, Arrays.asList(EstateStatus.ATL_UPLOAD_PENDING));
		
		nucleusDashboardCategories.put(postATLGeneration, Stream.of(nucleusDashboardCategories.get(LEGAL_REVIEW_AWAITED), nucleusDashboardCategories.get(ATL_SIGNED_NAMING_AWAITED), 
				nucleusDashboardCategories.get(ATL_GENERATED_BUT_NOT_SIGNED))
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
		
		
		//property named
		mapPair.put(EstateStatus.APPROVED_BY_LEADERSHIP, Pair.of(NucleusDashboardEnums.propertyNamed.toString(), NucleusDashboardEnums.PROPERTY_NAMED.toString()));
		
		nucleusDashboardCategories.put(PROPERTY_NAMED, Arrays.asList(EstateStatus.APPROVED_BY_LEADERSHIP));
		nucleusDashboardCategories.put(propertyNamed, Stream.of(nucleusDashboardCategories.get(PROPERTY_NAMED))
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
		
	}
	
	public static Map<EstateStatus,Pair<String, String>> getAllEnumDataMap(){
		return mapPair;
	}
	
	public static Map<NucleusDashboardEnums,List<EstateStatus>>  getAllNucleusDashboardEnumpairOfEstateStatus(){
		return nucleusDashboardCategories;
	}
}
