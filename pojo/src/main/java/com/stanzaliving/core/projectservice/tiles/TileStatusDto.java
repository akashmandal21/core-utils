package com.stanzaliving.core.projectservice.tiles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TileStatusDto {
    private String tiletext;
    private boolean isEnabled;
    private String link;
}
