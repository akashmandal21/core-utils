/**
 * 
 */
package com.stanzaliving.core.operations.utils;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.operations.dto.report.GraphRecordDto;
import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.MealCountRecordDto;
import com.stanzaliving.core.operations.dto.report.food.graph.FoodAttendanceGraphRecordDto;
import com.stanzaliving.core.operations.dto.report.food.graph.ProcessAdherenceGraphRecordDto;
import com.stanzaliving.core.operations.dto.report.food.graph.StudentFeedbackGraphRecordDto;
import com.stanzaliving.core.operations.dto.report.food.summary.DateLevelNumbersDto;
import com.stanzaliving.core.operations.dto.request.report.food.FoodReportRequestDto;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author naveen.kumar
 *
 * @date 26-Jan-2020
 *
 **/
@Log4j2
@UtilityClass
public class FoodReportUtil {

	public String getEntityForAccessLevel(AccessLevel accessLevel, RecordDto recordDto) {

		String entityUuid = null;

		if (AccessLevel.CITY == accessLevel) {
			entityUuid = recordDto.getCityUuid();
		} else if (AccessLevel.MICROMARKET == accessLevel) {
			entityUuid = recordDto.getMicromarketUuid();
		} else if (AccessLevel.RESIDENCE == accessLevel) {
			entityUuid = recordDto.getResidenceUuid();
		}

		return entityUuid;
	}

	public Integer getMIRCount(AccessLevel accessLevel, RecordDto recordDto, Map<String, DateLevelNumbersDto> dateLevelFieldsMap) {

		Integer mir = 0;

		String entityUuid = FoodReportUtil.getEntityForAccessLevel(accessLevel, recordDto);

		DateLevelNumbersDto dateLevelNumbersDto = dateLevelFieldsMap.get(entityUuid);

		if (Objects.nonNull(dateLevelNumbersDto)) {

			mir = dateLevelNumbersDto.getMovedInResidents();
		} else {

			for (Entry<String, DateLevelNumbersDto> entry : dateLevelFieldsMap.entrySet()) {
				mir += entry.getValue().getMovedInResidents();
			}

		}

		log.debug("MIR for " + accessLevel + " and Id: " + entityUuid + " is " + mir);

		return mir;
	}

	public Integer getOccupiedBedCount(AccessLevel accessLevel, RecordDto recordDto, Map<String, DateLevelNumbersDto> dateLevelFieldsMap) {

		Integer occupied = 0;

		String entityUuid = FoodReportUtil.getEntityForAccessLevel(accessLevel, recordDto);

		DateLevelNumbersDto dateLevelNumbersDto = dateLevelFieldsMap.get(entityUuid);

		if (Objects.nonNull(dateLevelNumbersDto)) {
			occupied = dateLevelNumbersDto.getOccupiedBeds();
		} else {

			for (Entry<String, DateLevelNumbersDto> entry : dateLevelFieldsMap.entrySet()) {
				occupied += entry.getValue().getOccupiedBeds();
			}

		}
		
		log.debug("Occupied for " + accessLevel + " and Id: " + entityUuid + " is " + occupied);

		return occupied;
	}


	public List<? extends GraphRecordDto> getAllCityAddedGraphRecordDtoList(List<? extends GraphRecordDto> graphRecordDtoList, AccessLevel accessLevel) {

		List<GraphRecordDto> allCityAddedGraphRecordDtoList = new ArrayList<>();

		if (AccessLevel.CITY.equals(accessLevel) && CollectionUtils.isNotEmpty(graphRecordDtoList) &&
				!graphRecordDtoList.stream().anyMatch(graphRecordDto -> null == graphRecordDto.getCityUuid())) {

			List<GraphRecordDto> allCityGraphRecordDtoList = new ArrayList<>();
			if (graphRecordDtoList.get(0) instanceof ProcessAdherenceGraphRecordDto) {
				allCityGraphRecordDtoList = getAllCityProcessAdherenceGraphRecordDto(graphRecordDtoList);
			} else if (graphRecordDtoList.get(0) instanceof StudentFeedbackGraphRecordDto) {
				allCityGraphRecordDtoList = getAllCityStudentFeedbackGraphRecordDto(graphRecordDtoList);
			} else if (graphRecordDtoList.get(0) instanceof FoodAttendanceGraphRecordDto) {
				allCityGraphRecordDtoList = getAllCityFoodAttendanceGraphRecordDto(graphRecordDtoList);
			}

			allCityAddedGraphRecordDtoList.addAll(allCityGraphRecordDtoList);

		}
		allCityAddedGraphRecordDtoList.addAll(graphRecordDtoList);//if separation needed for all cities and remaining
		return allCityAddedGraphRecordDtoList;
	}

	private List<GraphRecordDto> getAllCityFoodAttendanceGraphRecordDto(List<? extends GraphRecordDto> graphRecordDtoList) {

		Map<String, List<GraphRecordDto>> frequencyGraphRecordDtoMap = graphRecordDtoList.stream().collect(Collectors.groupingBy(GraphRecordDto::getFrequencyValue));
		List<GraphRecordDto> allCityFoodAttendanceGraphRecordDtoList = new ArrayList<>();

		for (String frequencyValue : frequencyGraphRecordDtoMap.keySet()) {
			List<? extends GraphRecordDto> graphRecordDtoListFrequencyValue = frequencyGraphRecordDtoMap.get(frequencyValue);
			FoodAttendanceGraphRecordDto allCityFoodAttendanceGraphRecordDto = FoodAttendanceGraphRecordDto.builder()
					.movedInResidents(0)
					.presentStudents(0)
					.foodAttendance(0)
					.totalCount(0)
					.build();

			FoodAttendanceGraphRecordDto foodAttendanceGraphRecordDto;
			for (GraphRecordDto graphRecordDto : graphRecordDtoListFrequencyValue) {
				foodAttendanceGraphRecordDto = (FoodAttendanceGraphRecordDto) graphRecordDto;
				allCityFoodAttendanceGraphRecordDto.setMovedInResidents(allCityFoodAttendanceGraphRecordDto.getMovedInResidents() + foodAttendanceGraphRecordDto.getMovedInResidents());
				allCityFoodAttendanceGraphRecordDto.setPresentStudents(allCityFoodAttendanceGraphRecordDto.getPresentStudents() + foodAttendanceGraphRecordDto.getPresentStudents());
				allCityFoodAttendanceGraphRecordDto.setFoodAttendance(allCityFoodAttendanceGraphRecordDto.getFoodAttendance() + foodAttendanceGraphRecordDto.getFoodAttendance());
				allCityFoodAttendanceGraphRecordDto.setTotalCount(allCityFoodAttendanceGraphRecordDto.getTotalCount() + foodAttendanceGraphRecordDto.getTotalCount());
				allCityFoodAttendanceGraphRecordDto.setFrequencyValue(foodAttendanceGraphRecordDto.getFrequencyValue());
			}
			allCityFoodAttendanceGraphRecordDtoList.add(allCityFoodAttendanceGraphRecordDto);
		}
		return allCityFoodAttendanceGraphRecordDtoList;
	}

	private List<GraphRecordDto> getAllCityStudentFeedbackGraphRecordDto(List<? extends GraphRecordDto> graphRecordDtoList) {
		Map<String, List<GraphRecordDto>> frequencyGraphRecordDtoMap = graphRecordDtoList.stream().collect(Collectors.groupingBy(GraphRecordDto::getFrequencyValue));
		List<GraphRecordDto> allCityStudentFeedbackGraphRecordDtoList = new ArrayList<>();

		for (String frequencyValue : frequencyGraphRecordDtoMap.keySet()) {
			List<? extends GraphRecordDto> graphRecordDtoListFrequencyValue = frequencyGraphRecordDtoMap.get(frequencyValue);
			StudentFeedbackGraphRecordDto allCityStudentFeedbackGraphRecordDto = StudentFeedbackGraphRecordDto.builder()
					.satisfied(0)
					.unsatisfied(0)
					.studentFeedbackCount(0)
					.build();

			StudentFeedbackGraphRecordDto studentFeedbackGraphRecordDto;
			for (GraphRecordDto graphRecordDto : graphRecordDtoListFrequencyValue) {
				studentFeedbackGraphRecordDto = (StudentFeedbackGraphRecordDto) graphRecordDto;
				allCityStudentFeedbackGraphRecordDto.setSatisfied(allCityStudentFeedbackGraphRecordDto.getSatisfied() + studentFeedbackGraphRecordDto.getSatisfied());
				allCityStudentFeedbackGraphRecordDto.setUnsatisfied(allCityStudentFeedbackGraphRecordDto.getUnsatisfied() + studentFeedbackGraphRecordDto.getUnsatisfied());
				allCityStudentFeedbackGraphRecordDto.setStudentFeedbackCount(allCityStudentFeedbackGraphRecordDto.getStudentFeedbackCount() + studentFeedbackGraphRecordDto.getStudentFeedbackCount());
				allCityStudentFeedbackGraphRecordDto.setFrequencyValue(studentFeedbackGraphRecordDto.getFrequencyValue());
			}
			allCityStudentFeedbackGraphRecordDtoList.add(allCityStudentFeedbackGraphRecordDto);
		}
		return allCityStudentFeedbackGraphRecordDtoList;
	}

	private List<GraphRecordDto> getAllCityProcessAdherenceGraphRecordDto(List<? extends GraphRecordDto> graphRecordDtoList) {
		Map<String, List<GraphRecordDto>> frequencyGraphRecordDtoMap = graphRecordDtoList.stream().collect(Collectors.groupingBy(GraphRecordDto::getFrequencyValue));
		List<GraphRecordDto> allCityProcessAdherenceGraphRecordDtoList = new ArrayList<>();

		for (String frequencyValue : frequencyGraphRecordDtoMap.keySet()) {
			List<? extends GraphRecordDto> graphRecordDtoListFrequencyValue = frequencyGraphRecordDtoMap.get(frequencyValue);
			ProcessAdherenceGraphRecordDto allCityProcessAdherenceGraphRecordDto = ProcessAdherenceGraphRecordDto.builder()
					.totalCount(0)
					.menuAdherence(0)
					.quantityAdherence(0)
					.onTimeDelivery(0)
					.orderedOnTime(0)
					.menuCreated(0)
					.build();

			ProcessAdherenceGraphRecordDto processAdherenceGraphRecordDto;
			for (GraphRecordDto graphRecordDto : graphRecordDtoListFrequencyValue) {
				processAdherenceGraphRecordDto = (ProcessAdherenceGraphRecordDto) graphRecordDto;
				allCityProcessAdherenceGraphRecordDto.setTotalCount(allCityProcessAdherenceGraphRecordDto.getTotalCount() + processAdherenceGraphRecordDto.getTotalCount());
				allCityProcessAdherenceGraphRecordDto.setMenuAdherence(allCityProcessAdherenceGraphRecordDto.getMenuAdherence() + processAdherenceGraphRecordDto.getMenuAdherence());
				allCityProcessAdherenceGraphRecordDto.setQuantityAdherence(allCityProcessAdherenceGraphRecordDto.getQuantityAdherence() + processAdherenceGraphRecordDto.getQuantityAdherence());
				allCityProcessAdherenceGraphRecordDto.setOnTimeDelivery(allCityProcessAdherenceGraphRecordDto.getOnTimeDelivery() + processAdherenceGraphRecordDto.getOnTimeDelivery());
				allCityProcessAdherenceGraphRecordDto.setOrderedOnTime(allCityProcessAdherenceGraphRecordDto.getOrderedOnTime() + processAdherenceGraphRecordDto.getOrderedOnTime());
				allCityProcessAdherenceGraphRecordDto.setMenuCreated(allCityProcessAdherenceGraphRecordDto.getMenuCreated() + processAdherenceGraphRecordDto.getMenuCreated());
				allCityProcessAdherenceGraphRecordDto.setFrequencyValue(processAdherenceGraphRecordDto.getFrequencyValue());
			}
			allCityProcessAdherenceGraphRecordDtoList.add(allCityProcessAdherenceGraphRecordDto);
		}
		return allCityProcessAdherenceGraphRecordDtoList;
	}

	public static MealCountRecordDto getAggregatedMealCountRecordDto(List<RecordDto> recordDtoList) {
		if (CollectionUtils.isEmpty(recordDtoList)) {
			return null;
		}
		MealCountRecordDto aggregatedMealCountRecordDto = (MealCountRecordDto) recordDtoList.get(0);
		for (Integer i = 1; i < recordDtoList.size() ; i++) {
			MealCountRecordDto mealCountRecordDto = (MealCountRecordDto) recordDtoList.get(i);
			aggregatedMealCountRecordDto.setOverallCount(aggregatedMealCountRecordDto.getOverallCount() + mealCountRecordDto.getOverallCount());
			aggregatedMealCountRecordDto.setBreakfastCount(aggregatedMealCountRecordDto.getBreakfastCount() + mealCountRecordDto.getBreakfastCount());
			aggregatedMealCountRecordDto.setLunchTiffinCount(aggregatedMealCountRecordDto.getLunchTiffinCount() + mealCountRecordDto.getLunchTiffinCount());
			aggregatedMealCountRecordDto.setBrunchCount(aggregatedMealCountRecordDto.getBrunchCount() + mealCountRecordDto.getBrunchCount());
			aggregatedMealCountRecordDto.setLunchCount(aggregatedMealCountRecordDto.getLunchCount() + mealCountRecordDto.getLunchCount());
			aggregatedMealCountRecordDto.setSnacksCount(aggregatedMealCountRecordDto.getSnacksCount() + mealCountRecordDto.getSnacksCount());
			aggregatedMealCountRecordDto.setDinnerCount(aggregatedMealCountRecordDto.getDinnerCount() + mealCountRecordDto.getDinnerCount());
		}
		return aggregatedMealCountRecordDto;
	}

	public static Map<String, MealCountRecordDto> getMealFilteredMealCountAccessLevelRecordDtoMap(Map<String, MealCountRecordDto> mealCountAccessLevelRecordDtoMap, FoodReportRequestDto foodReportRequestDto) {

		if (CollectionUtils.isNotEmpty(foodReportRequestDto.getMealUuid())) {
			for(String accessLevelId : mealCountAccessLevelRecordDtoMap.keySet()) {
				MealCountRecordDto mealCountRecordDto = mealCountAccessLevelRecordDtoMap.get(accessLevelId);

				//applying meal level filter
				if (!foodReportRequestDto.getMealUuid().contains(MealType.BREAKFAST.getMealId().toString())) {
					mealCountRecordDto.setBreakfastCount(0);
				}
				if (!foodReportRequestDto.getMealUuid().contains(MealType.LUNCH.getMealId().toString())) {
					mealCountRecordDto.setLunchCount(0);
				}
				if (!foodReportRequestDto.getMealUuid().contains(MealType.EVENING_SNACKS.getMealId().toString())) {
					mealCountRecordDto.setSnacksCount(0);
				}
				if (!foodReportRequestDto.getMealUuid().contains(MealType.DINNER.getMealId().toString())) {
					mealCountRecordDto.setDinnerCount(0);
				}
				if (!foodReportRequestDto.getMealUuid().contains(MealType.BRUNCH.getMealId().toString())) {
					mealCountRecordDto.setBrunchCount(0);
				}
				if (!foodReportRequestDto.getMealUuid().contains(MealType.LUNCH_TIFFIN.getMealId().toString())) {
					mealCountRecordDto.setLunchTiffinCount(0);
				}

				//considering brunch and tiffin as lunch and updating overall with meal filter
				mealCountRecordDto.setLunchCount(mealCountRecordDto.getLunchCount() + mealCountRecordDto.getBrunchCount() + mealCountRecordDto.getLunchTiffinCount());
				mealCountRecordDto.setOverallCount(mealCountRecordDto.getLunchCount() + mealCountRecordDto.getBreakfastCount() + mealCountRecordDto.getDinnerCount() + mealCountRecordDto.getSnacksCount());
			}
		}

		Map<String, MealCountRecordDto> updatedMealCountAccessLevelRecordDtoMap = mealCountAccessLevelRecordDtoMap;

		if (null == foodReportRequestDto.getAccessLevel()) {
			MealCountRecordDto mealCountRecordDto = mealCountAccessLevelRecordDtoMap.get(null);
			updatedMealCountAccessLevelRecordDtoMap.put("1", MealCountRecordDto.builder().overallCount(mealCountRecordDto.getBreakfastCount()).build());
			updatedMealCountAccessLevelRecordDtoMap.put("2", MealCountRecordDto.builder().overallCount(mealCountRecordDto.getLunchCount()).build());
			updatedMealCountAccessLevelRecordDtoMap.put("3", MealCountRecordDto.builder().overallCount(mealCountRecordDto.getSnacksCount()).build());
			updatedMealCountAccessLevelRecordDtoMap.put("4", MealCountRecordDto.builder().overallCount(mealCountRecordDto.getDinnerCount()).build());
		}

		return updatedMealCountAccessLevelRecordDtoMap;
	}
}