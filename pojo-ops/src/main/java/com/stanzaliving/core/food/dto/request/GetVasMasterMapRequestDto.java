package com.stanzaliving.core.food.dto.request;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 * @since 28-AUG-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GetVasMasterMapRequestDto {
	private Collection<String> vasItemIds;
	private Boolean status;
	private Boolean dataComplete;
	
}
