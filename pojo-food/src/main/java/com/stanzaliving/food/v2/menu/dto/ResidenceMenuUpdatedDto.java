package com.stanzaliving.food.v2.menu.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class ResidenceMenuUpdatedDto implements Serializable {
	private List<ResidenceMenuDto> addedMenus;
	private List<ResidenceMenuDto> deletedMenus;
	private List<ResidenceMenuDto> updatedMenus;
	private LocalDate weekStartDate;
}
