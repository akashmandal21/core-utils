
package com.stanzaliving.website.response.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ElasticsearchRequestDTO {

	private List<Integer> placeIds = new ArrayList<Integer>();

}
