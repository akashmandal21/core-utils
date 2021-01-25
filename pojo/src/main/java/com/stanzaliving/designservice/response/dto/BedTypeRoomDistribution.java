/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import java.util.List;

import com.stanzaliving.designservice.enums.BedType;
import com.stanzaliving.designservice.request.dto.BedRoomDistribution;

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
public class BedTypeRoomDistribution {

	private BedType bedType;
	private int totalBed;
	private int totalRoom;
	private List<BedRoomDistribution> bedRoomDistribution;
	private String designFile;
	private String designFileName;
	private String cadFile;
	private String cadFileName;
}
