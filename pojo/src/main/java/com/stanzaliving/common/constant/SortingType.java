package com.stanzaliving.common.constant;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SortingType {
    ASC("Ascending"), DSC("Descending");
    private final String type;
    
    public <T extends Comparable<? super T>> Comparator<T> comparator() {
        return this == ASC ? Comparator.nullsLast(Comparator.naturalOrder()) : Comparator.nullsLast(Comparator.reverseOrder());
    }
}
