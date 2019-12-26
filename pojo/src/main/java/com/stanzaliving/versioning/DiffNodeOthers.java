package com.stanzaliving.versioning;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DiffNodeOthers
{
    String tag;
    JsonNode oldValue;
    JsonNode newValue;
}
