package com.stanzaliving.core.operations.enums;

import com.stanzaliving.core.electricity.constants.MeterType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ResidentStatus {
	MOVED_IN("Moved In"),
	MOVED_OUT("Moved Out");

	private String statusName;

	private static List<EnumListing<ResidentStatus>> movedStatusMap = new ArrayList<>();
	static {
		for(ResidentStatus movedStatus: ResidentStatus.values()){
			movedStatusMap.add(EnumListing.of(movedStatus, movedStatus.statusName));
		}
	}

	public static  List<EnumListing<ResidentStatus>> getMovedStatusMap(){
		return movedStatusMap;
	}
	
	
	
}
