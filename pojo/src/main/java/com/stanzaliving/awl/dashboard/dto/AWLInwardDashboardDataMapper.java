package com.stanzaliving.awl.dashboard.dto;
import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;

import com.stanzaliving.awl.dto.AWLInwardDataDto;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AWLInwardDashboardDataMapper {

	private static String KEY_TOTAL ="Total";
	private static String KEY_OVER_ALL ="Overall";
	
	
	public AWLInwardDashboardResponseDto  prepareInwardResponseData(List<AWLInwardDataDto> awlInwardDataDtos){
		AWLInwardDashboardResponseDto responseDto = AWLInwardDashboardResponseDto.builder().build();
		
		List<AWLInwardDashboardItemCategoryDto> itemCategoryDataList = new ArrayList<>();
		
		if(CollectionUtils.isNotEmpty(awlInwardDataDtos)) {
			//grouuped by {categoryCode:[dtos]}
			Map<String,List<AWLInwardDataDto>> groupedByCategoryCode = 	groupedByItemCategory(awlInwardDataDtos);
			
			//iterate over each category grouped above
			groupedByCategoryCode.forEach((itemCategory,categoryListData) ->{
				
				//group by item 
				List<AWLInwardDashboardItemDto> items = new ArrayList<>();
				Map<String,List<AWLInwardDataDto>> grouppedByItem =groupedByItemDescription(categoryListData);
				grouppedByItem.forEach((item,dataList) ->{
					
					//group by vendor
					Map<String,List<AWLInwardDataDto>> grouppedByVendor = groupedByVendor(dataList);
					List<AWLInwardDashboardVendorDto> vendors = prepareVendorDtos(grouppedByVendor,responseDto);
					
					AWLInwardDashboardItemDto itemDto = AWLInwardDashboardItemDto.builder()
							//.categotyData(categotyData) TBD
							.vendors(vendors).itemName(item)
							.build();
					
					items.add(itemDto);
				});
				
				AWLInwardDashboardItemCategoryDto categoryDto = AWLInwardDashboardItemCategoryDto.builder()
						.itemCategoryCode(itemCategory)
						//.categotyData(categotyData) TBD
						.itemCategoryName(itemCategory)
						.items(items)
						.build();
				itemCategoryDataList.add(categoryDto);
			});
		}
		
		responseDto.setDashboardRecords(itemCategoryDataList);
		
		return responseDto;
	}
	
	private List<AWLInwardDashboardVendorDto> prepareVendorDtos(Map<String, List<AWLInwardDataDto>> grouppedByVendor, AWLInwardDashboardResponseDto responseDto) {
		List<AWLInwardDashboardVendorDto> vendors = new ArrayList<>();
		
		Set<String> wareHouses = new HashSet<>();
		Set<String> cities = new HashSet<>();
		Map<String,Set<String>> cityWithWareHousesMappings = new HashMap<>();
		
		
		grouppedByVendor.forEach((vendor,dataList)->{
			AWLInwardDashboardVendorDto vendorDto = AWLInwardDashboardVendorDto.builder().vendorName(vendor).build();
			
			Map<String,List<AWLInwardDataDto>> groupedByWareHouseCity = groupedByWareHouseCity(dataList);
			
			Map<String,Map<String,AWLDashboardCountDto>> categoryData = new ConcurrentHashMap<>();
			
			//city iteration starts here
			groupedByWareHouseCity.forEach((city,data) -> {
				
				Map<String,List<AWLInwardDataDto>> groupedByWareHouse = groupedByWareHouse(data);
				Map<String,AWLDashboardCountDto> wareHouseCountDto = new HashMap<>();
				
				
				groupedByWareHouse.forEach((wareHouse,dtos) ->{
					
					AWLDashboardCountDto countDto = AWLDashboardCountDto.builder().build();
					countDto.setQuantity(dtos.stream().collect(Collectors.summingInt(AWLInwardDataDto::getQuantity)));
					countDto.setValue(dtos.stream().collect(Collectors.summingDouble(AWLInwardDataDto::getValue)));
					
					wareHouseCountDto.put(wareHouse, countDto);
					wareHouses.add(wareHouse);
					
				});
				
				Integer totalCountQuantity =wareHouseCountDto.values().stream().collect(Collectors.summingInt(AWLDashboardCountDto :: getQuantity));
				Double totalCountValues =wareHouseCountDto.values().stream().collect(Collectors.summingDouble(AWLDashboardCountDto :: getValue));
				AWLDashboardCountDto totalCountDto = AWLDashboardCountDto.builder()
						.quantity(totalCountQuantity).value(totalCountValues)
						.build();
				wareHouseCountDto.put(KEY_TOTAL,totalCountDto);
				categoryData.put(city, wareHouseCountDto);
				
				cityWithWareHousesMappings.put(city, wareHouses);
				
				
				cities.add(city);
			});//end of city iteration
			
			
			//prepare overall data 
			categoryData.put(KEY_OVER_ALL, getOverAllData(categoryData));

			vendorDto.setCategotyData(categoryData);
			
			vendors.add(vendorDto);
		});
		
		responseDto.setCities(cities);
		responseDto.setWareHouses(wareHouses);
		responseDto.setCityWiseWarehouses(cityWithWareHousesMappings);
		
		return vendors;
	}


	private  Map<String, AWLDashboardCountDto> getOverAllData(Map<String, Map<String, AWLDashboardCountDto>> categoryData) {
		Integer overAllQuantity =0;
		Double overAllValue =0d;
		for(Entry<String, Map<String, AWLDashboardCountDto>> data : categoryData.entrySet()) {
			overAllQuantity += data.getValue().get(KEY_TOTAL).getQuantity();
			overAllValue += data.getValue().get(KEY_TOTAL).getValue();
		}
		Map<String,AWLDashboardCountDto> overAllData = new HashMap<>();
		overAllData.put(KEY_TOTAL,AWLDashboardCountDto.builder()
				.quantity(overAllQuantity).value(overAllValue).build());
		return overAllData;
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
