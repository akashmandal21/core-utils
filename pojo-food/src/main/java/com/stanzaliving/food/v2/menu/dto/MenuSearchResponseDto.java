package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.core.base.common.dto.PageResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuSearchResponseDto implements Serializable {
	private MenuSearchStatsRDto stats;
	private PageResponse<? extends MenuSearchRDto> menuData;
}
