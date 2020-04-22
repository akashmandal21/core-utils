package com.stanzaliving.awl.dashboard.dto;
import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.stanzaliving.awl.dto.AWLInwardDataDto;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AWLInwardDashboardDataMapper {

	//prepare level-1(item-category data)
	public List<AWLInwardDashboardItemCategoryDto> prepareItemCategoryData(List<AWLInwardDataDto> awlInwardDataDtos){

		List<AWLInwardDashboardItemCategoryDto> itemCategoryDataList = new ArrayList<>();
		
		if(CollectionUtils.isNotEmpty(awlInwardDataDtos)) {
			//grouuped by {categoryCode:[dtos]}
			Map<String,List<AWLInwardDataDto>> groupedByCategoryCode = 	groupedByItemCategory(awlInwardDataDtos);
			
			//iterate over each category grouped above
			groupedByCategoryCode.forEach((categoryCode,categoryListData) ->{
				AWLInwardDashboardItemCategoryDto categoryDto = AWLInwardDashboardItemCategoryDto.builder().itemCategoryCode(categoryCode).build();
				
				//group by item 
				Map<String,List<AWLInwardDataDto>> grouppedByItem =groupedByItemDescription(categoryListData);
				grouppedByItem.forEach((item,dataList) ->{
					//group by vendor
					Map<String,List<AWLInwardDataDto>> grouppedByVendor = groupedByVendor(dataList);
					
				});
				
			});
		}
		return null;
	}
	
	//group data by item category
	private Map<String,List<AWLInwardDataDto>> groupedByItemCategory(List<AWLInwardDataDto> dtos){
			return dtos.stream().collect(groupingBy(AWLInwardDataDto::getCategoryName));
	}
	
	
	//group data by item description
	private Map<String,List<AWLInwardDataDto>> groupedByItemDescription(List<AWLInwardDataDto> dtos){
		return dtos.stream().collect(groupingBy(AWLInwardDataDto::getItemDescription));
	}
	
	//group data by vendor
	private Map<String,List<AWLInwardDataDto>> groupedByVendor(List<AWLInwardDataDto> dtos){
			return dtos.stream().collect(groupingBy(AWLInwardDataDto::getVendor));
	}
	
	
	//group data by wareHouseCity
	private Map<String,List<AWLInwardDataDto>> groupedByWareHouseCity(List<AWLInwardDataDto> dtos){
				return dtos.stream().collect(groupingBy(AWLInwardDataDto::getWarehouseCity));
	}
	
	//group data by warehouse name
	private Map<String,List<AWLInwardDataDto>> groupedByWareHouse(List<AWLInwardDataDto> dtos){
				return dtos.stream().collect(groupingBy(AWLInwardDataDto::getWarehouseName));
	}
}
