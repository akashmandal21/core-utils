package com.stanzaliving.search.food.search.dto.response.menu.fps;

import com.stanzaliving.search.food.search.dto.response.IdFpsDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 26-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MicromarketIdFpsDto extends FpsDto {
	private String micromarketId;
	
	public MicromarketIdFpsDto(IdFpsDto idFpsDto) {
		micromarketId = idFpsDto.getId();
		this.setDelightedCount(idFpsDto.getDelightedCount());
		this.setDisgustedCount(idFpsDto.getDisgustedCount());
		this.setTotalRatingCount(idFpsDto.getTotalRatingCount());
		this.setFpsPercent(idFpsDto.getFpsPercent());
	}
	
}
