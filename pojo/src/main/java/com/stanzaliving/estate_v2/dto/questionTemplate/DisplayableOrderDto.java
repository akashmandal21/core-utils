package com.stanzaliving.estate_v2.dto.questionTemplate;

public interface DisplayableOrderDto {
    boolean isValidDisplayOrder(Integer displayOrder);
    boolean isObjectPresent(String uuid);
}
