package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WebsitePageConfigType {

    LISTING_PAGE_HEADER_CAROUSEL_BANNERS("Listing Page Header Carousel Banners"),
    LISTING_PAGE_CARD_BANNER("Listing Page Card Banner");

    private String websiteConfigTypeName;
}
