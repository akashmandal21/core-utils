package com.stanzaliving.core.projectservice.tiles;

public interface TileStatusDecider {
    TileStatusDto canOpen(TileDeciderDto tileDeciderDto);
    PropertyReportsTile getReportTile();
}
