package com.stanzaliving.versioning.diff;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class DiffObject
{
   String path;
   String newPath;
   Object oldValue;
   Object newValue;
}

