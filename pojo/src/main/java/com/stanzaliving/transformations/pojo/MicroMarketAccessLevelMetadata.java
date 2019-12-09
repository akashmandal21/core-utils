package com.stanzaliving.transformations.pojo;

import lombok.*;

import java.util.List;
import java.util.Map;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MicroMarketAccessLevelMetadata {

	Map<Long,List<MicroMarketUIDto>> microMarketNameViews;
}
