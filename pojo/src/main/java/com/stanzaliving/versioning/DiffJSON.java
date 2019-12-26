package com.stanzaliving.versioning;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder

//TODO: Move all versioning pojos to core-utils
public class DiffJSON
{
    DiffNodeMoved[] moved;
    Map<String, DiffNodeOthers[]> others;
}

