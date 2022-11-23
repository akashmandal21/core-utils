package com.stanzaliving.core.discount.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiscountCategory {
    EARLY_BIRD("Early Bird" , "EB")
    ,GROUP_DISCOUNT("Group Discount" , "GR")
    ,FLASH_SALE("Flash Sale" , "FS")
    ,RETENTION_DISCOUNT("Retention Discount" , "RT")
    ,RELATIONSHIP_DISCOUNT("Relationship Discount" , "RL")
    ,POC_DISCOUNT("POC Discount" , "PC")
    ,POST_SEASON_DISCOUNT("Post Season Discount" , "PS")
    ,ONE_TIME_DISCOUNT("One time Discount" , "OT");

    String name;
    String shorthand;
}