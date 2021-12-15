
package com.stanzaliving.vms.response.dto;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author manish.pareek
 * @date 02/12/21
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class QuickFilterCountDto {

	private String id;
	private String name;
	private long count;
	private Collection<String> infoList;
	private Integer sequence;
}
