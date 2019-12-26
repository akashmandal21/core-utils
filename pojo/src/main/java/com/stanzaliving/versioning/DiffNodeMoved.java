package com.stanzaliving.versioning;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DiffNodeMoved
{
    String oldPath;
    String newPath;
}
