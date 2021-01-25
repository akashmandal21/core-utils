package com.stanzaliving.core.projectservice.tiles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TileStatusDto {
    private String tiletext;
    private boolean isEnabled;
    private String link;
}
