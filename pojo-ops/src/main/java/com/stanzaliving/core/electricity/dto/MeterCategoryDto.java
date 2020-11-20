package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class MeterCategoryDto extends AbstractDto {

	private static final long serialVersionUID = 7761588143981654423L;

	private String categoryId;

	private List<String> subCategoryIds;

}
