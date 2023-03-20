package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DynamicUrlType {

    OSM_URL_PG("Osm Url - Pg"),
    OSM_URL_COLIVING("Osm Url - Coliving"),
    OSM_URL_APARTMENT("Osm Url - Apartment"),
    STANZA_PLACE_URL("Stanza Place Url"),
    FLAT_URL("Flat Url");

    private String name;
}
