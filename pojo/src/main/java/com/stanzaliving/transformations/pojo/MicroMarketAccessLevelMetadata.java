package com.stanzaliving.transformations.pojo;

import java.util.List;
import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class MicroMarketAccessLevelMetadata {

	Map<Long,List<MicroMarketUIDto>> microMarketNameViews;
}
