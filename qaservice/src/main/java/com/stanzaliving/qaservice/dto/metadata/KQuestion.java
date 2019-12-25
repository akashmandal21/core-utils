package com.stanzaliving.qaservice.dto.metadata;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KQuestion {
    String quesCount;
    String screenName;
    List<Long> questionIds;
}
