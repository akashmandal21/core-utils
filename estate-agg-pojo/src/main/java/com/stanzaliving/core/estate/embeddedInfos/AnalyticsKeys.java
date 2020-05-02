package com.stanzaliving.core.estate.embeddedInfos;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@AllArgsConstructor
public class AnalyticsKeys {
    @Indexed
    Long rentPerBed;
}
