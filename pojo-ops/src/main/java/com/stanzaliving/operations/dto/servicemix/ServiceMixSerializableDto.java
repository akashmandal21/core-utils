package com.stanzaliving.operations.dto.servicemix;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdDeserializer;
import com.stanzaliving.core.base.localdate.Java8LocalDateStdSerializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeDeserializer;
import com.stanzaliving.core.base.localtime.Java8LocalTimeSerializer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ServiceMixSerializableDto {
	private String uuid;
	
	private String residenceId;
	private String residenceName;
	
	private String cityId;
	private String cityName;
	
	private String microMarketId;
	private String microMarketName;
	
	private String versionName;
	
	private Long version;
	
	private LocalDate fromDate;
	
	private boolean scheduled;
	
    private Config config;
    
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
    	ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);

		SimpleModule module = new SimpleModule();
		module.addSerializer(new Java8LocalDateStdSerializer());
		module.addDeserializer(LocalDate.class, new Java8LocalDateStdDeserializer());

		module.addSerializer(new Java8LocalTimeSerializer());
		module.addDeserializer(LocalTime.class, new Java8LocalTimeDeserializer());

		mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.registerModule(module);

		
		System.out.println(mapper.readValue(json, ServiceMixSerializableDto.class));
		
	}
    
    static String json = "{\n" + 
    		"	\"residenceId\" : \"407be7ac-fca9-403d-bae1-b5b2f2327c2e\",\n" + 
    		"	\"cityId\" : \"3\",\n" + 
    		"	\"microMarketId\" : \"3fb51f47-3165-4c83-965d-cccd59cbb7c8\",\n" + 
    		"	\"versionName\": \"Annapolis House_2020-06-19_17:35:32_Naveen\",\n" + 
    		"	\"version\" : 20,\n" + 
    		"    \"fromDate\" : \"2020-06-19\",\n" + 
    		"	\"config\" : {\n" + 
    		"  \"gym\": {\n" + 
    		"    \"gym\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"timing\": [\n" + 
    		"        [\n" + 
    		"          \"06:00 AM\",\n" + 
    		"          \"10:00 AM\"\n" + 
    		"        ],\n" + 
    		"        [\n" + 
    		"          \"04:00 PM\",\n" + 
    		"          \"08:00 PM\"\n" + 
    		"        ]\n" + 
    		"      ],\n" + 
    		"      \"location\": \"IN_RESIDENCE\"\n" + 
    		"    },\n" + 
    		"    \"active\": true\n" + 
    		"  },\n" + 
    		"  \"other\": {\n" + 
    		"    \"active\": true,\n" + 
    		"    \"room_dth\": {\n" + 
    		"      \"active\": true\n" + 
    		"    },\n" + 
    		"    \"supplies\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"repetition\": \"ALL_DAY\"\n" + 
    		"    },\n" + 
    		"    \"cafetaria\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"timing\": [\n" + 
    		"        [\n" + 
    		"          \"07:30 AM\",\n" + 
    		"          \"08:30 PM\"\n" + 
    		"        ]\n" + 
    		"      ]\n" + 
    		"    },\n" + 
    		"    \"coffee_machine\": {\n" + 
    		"      \"active\": true\n" + 
    		"    },\n" + 
    		"    \"vending_machine\": {\n" + 
    		"      \"active\": true\n" + 
    		"    }\n" + 
    		"  },\n" + 
    		"  \"laundry\": {\n" + 
    		"    \"active\": true,\n" + 
    		"    \"washFold\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"cloths\": 20,\n" + 
    		"      \"weight\": 0,\n" + 
    		"      \"unitType\": \"QUANTITY\",\n" + 
    		"      \"repetation\": 3\n" + 
    		"    },\n" + 
    		"    \"washIron\": {\n" + 
    		"      \"active\": false,\n" + 
    		"      \"cloths\": 0,\n" + 
    		"      \"weight\": 4.5,\n" + 
    		"      \"unitType\": \"WEIGHT\",\n" + 
    		"      \"repetation\": 4\n" + 
    		"    }\n" + 
    		"  },\n" + 
    		"  \"foodMenu\": {\n" + 
    		"    \"active\": true,\n" + 
    		"    \"category\" : \"e5b67896-4106-431f-9fe3-daa9d75530ed\",\n" + 
    		"    \"stanzaKitchen\" : true,\n" + 
    		"    \"meals\" : {\n" + 
    		"    	\"BREAKFAST\" : 10,\n" + 
    		"    	\"LUNCH\" : 23,\n" + 
    		"    	\"DINNER\" : 23\n" + 
    		"    },\n" + 
    		"    \"totalPrice\" : 56\n" + 
    		"  },\n" + 
    		"  \"internet\": {\n" + 
    		"    \"active\": true,\n" + 
    		"    \"internet\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"planId\": \"3290bc1a-b0c0-11ea-9563-027e755f1518\",\n" + 
    		"      \"vendor\": \"JIO\",\n" + 
    		"      \"devices\": 2,\n" + 
    		"      \"totalPrice\": 225\n" + 
    		"    }\n" + 
    		"  },\n" + 
    		"  \"security\": {\n" + 
    		"    \"active\": true,\n" + 
    		"    \"blanket\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"providedFor\" : \"ALL_STUDENT\"\n" + 
    		"    },\n" + 
    		"    \"bioMetric\": {\n" + 
    		"      \"active\": false\n" + 
    		"    },\n" + 
    		"    \"cardAccess\": {\n" + 
    		"      \"active\": true\n" + 
    		"    },\n" + 
    		"    \"nightCurfew\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"timing\" : \"09:00 PM\"\n" + 
    		"    }\n" + 
    		"  },\n" + 
    		"  \"transport\": {\n" + 
    		"    \"active\": true,\n" + 
    		"    \"transport\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"freeKm\" : 4.5,\n" + 
    		"      \"availability\"  : \"PICKUP_DROP\",\n" + 
    		"      \"schedule\" : \"SCHEDULED\"\n" + 
    		"    }\n" + 
    		"  },\n" + 
    		"  \"electricity\": {\n" + 
    		"    \"ac\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"timing\": [\n" + 
    		"        [\n" + 
    		"          \"06:00 AM\",\n" + 
    		"          \"10:00 AM\"\n" + 
    		"        ],\n" + 
    		"        [\n" + 
    		"          \"04:00 PM\",\n" + 
    		"          \"06:00 PM\"\n" + 
    		"        ]\n" + 
    		"      ]\n" + 
    		"    },\n" + 
    		"    \"room\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"payment\": \"INCLUDED\"\n" + 
    		"    },\n" + 
    		"    \"active\": true,\n" + 
    		"    \"geyser\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"timing\": [\n" + 
    		"        [\n" + 
    		"          \"06:00 AM\",\n" + 
    		"          \"10:00 AM\"\n" + 
    		"        ],\n" + 
    		"        [\n" + 
    		"          \"04:00 PM\",\n" + 
    		"          \"06:00 PM\"\n" + 
    		"        ]\n" + 
    		"      ]\n" + 
    		"    },\n" + 
    		"    \"common_area\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"payment\": \"INCLUDED\"\n" + 
    		"    },\n" + 
    		"    \"commonGeyser\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"timing\": [\n" + 
    		"        [\n" + 
    		"          \"06:00 AM\",\n" + 
    		"          \"10:00 AM\"\n" + 
    		"        ],\n" + 
    		"        [\n" + 
    		"          \"04:00 PM\",\n" + 
    		"          \"06:00 PM\"\n" + 
    		"        ]\n" + 
    		"      ]\n" + 
    		"    },\n" + 
    		"    \"power_backup\": {\n" + 
    		"      \"type\": \"DG\",\n" + 
    		"      \"active\": true\n" + 
    		"    }\n" + 
    		"  },\n" + 
    		"  \"foodService\": {\n" + 
    		"    \"LUNCH\": {\n" + 
    		"      \"days\": 2,\n" + 
    		"      \"active\": true,\n" + 
    		"      \"endTime\": \"02:30 PM\",\n" + 
    		"      \"startTime\": \"12:00 PM\"\n" + 
    		"    },\n" + 
    		"    \"BRUNCH\": {\n" + 
    		"      \"active\": false\n" + 
    		"    },\n" + 
    		"    \"DINNER\": {\n" + 
    		"      \"days\": 7,\n" + 
    		"      \"active\": true,\n" + 
    		"      \"endTime\": \"09:30 PM\",\n" + 
    		"      \"startTime\": \"07:00 PM\"\n" + 
    		"    },\n" + 
    		"    \"active\": true,\n" + 
    		"    \"BREAKFAST\": {\n" + 
    		"      \"days\": 7,\n" + 
    		"      \"active\": true,\n" + 
    		"      \"endTime\": \"09:30 AM\",\n" + 
    		"      \"startTime\": \"07:00 AM\"\n" + 
    		"    },\n" + 
    		"    \"LUNCH_TIFFIN\": {\n" + 
    		"      \"active\": false\n" + 
    		"    },\n" + 
    		"    \"EVENING_SNACKS\": {\n" + 
    		"      \"active\": false\n" + 
    		"    }\n" + 
    		"  },\n" + 
    		"  \"houseKeeping\": {\n" + 
    		"    \"room\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"daysPerWeek\": 3\n" + 
    		"    },\n" + 
    		"    \"active\": true,\n" + 
    		"    \"bathroom\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"daysPerWeek\": 3\n" + 
    		"    },\n" + 
    		"    \"common_area\": {\n" + 
    		"      \"active\": true,\n" + 
    		"      \"daysPerWeek\": 7\n" + 
    		"    },\n" + 
    		"    \"linen_change\": {\n" + 
    		"      \"active\": false\n" + 
    		"    },\n" + 
    		"    \"commonBathroom\": {\n" + 
    		"      \"active\": false\n" + 
    		"    }\n" + 
    		"  },\n" + 
    		"  \"foodComposition\": {\n" + 
    		"    \"active\": true,\n" + 
    		"    \"tags\" : [\n" + 
    		"     {\n" + 
    		"      \"uuid\" : \"b8910313-95f8-11ea-98d7-0a708c1ccd4a\",\n" + 
    		"      \"active\": true,\n" + 
    		"      \"repetition\": 1\n" + 
    		"    },\n" + 
    		"    {\n" + 
    		"      \"uuid\":\"ba4b7515-95f8-11ea-98d7-0a708c1ccd4a\",\n" + 
    		"      \"active\": true,\n" + 
    		"      \"repetition\": 2\n" + 
    		"    },\n" + 
    		"    {\n" + 
    		"    	\"uuid\" : \"c4930113-95f8-11ea-98d7-0a708c1ccd4a\",\n" + 
    		"      \"active\": true,\n" + 
    		"      \"repetition\": 7\n" + 
    		"    },\n" + 
    		"    {\n" + 
    		"      \"uuid\" : \"c4930114-95f8-11ea-98d7-0a708c1ccd4a\",\n" + 
    		"      \"active\": false\n" + 
    		"    },\n" + 
    		"    {\n" + 
    		"    	\"uuid\" : \"c4930115-95f8-11ea-98d7-0a708c1ccd4a\",\n" + 
    		"      \"active\": false\n" + 
    		"    },\n" + 
    		"    {\n" + 
    		"    	\"uuid\" : \"c4930118-95f8-11ea-98d7-0a708c1ccd4a\",\n" + 
    		"      \"active\": true,\n" + 
    		"      \"repetition\": 2\n" + 
    		"    },\n" + 
    		"    {\n" + 
    		"    	\"uuid\" : \"c4930119-95f8-11ea-98d7-0a708c1ccd4a\",\n" + 
    		"      \"active\": true,\n" + 
    		"      \"repetition\": 3\n" + 
    		"    }\n" + 
    		"    ]\n" + 
    		"  }\n" + 
    		"}\n" + 
    		"}";
}
