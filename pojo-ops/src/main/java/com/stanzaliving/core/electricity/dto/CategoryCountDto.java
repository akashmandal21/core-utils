package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.base.common.dto.ListingCountDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryCountDto extends ListingCountDto {

	private static final long serialVersionUID = 4472886099306026769L;
	
	List<ListingCountDto> subCategoryWiseCount;
}
