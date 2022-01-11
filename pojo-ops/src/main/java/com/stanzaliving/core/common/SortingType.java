package com.stanzaliving.core.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Comparator;

@AllArgsConstructor
@Getter
public enum SortingType {
    ASC("Ascending"), DSC("Descending");
    private final String type;
    
    public <T extends Comparable<? super T>> Comparator<T> comparator() {
        return this == ASC ? Comparator.nullsLast(Comparator.naturalOrder()) : Comparator.nullsLast(Comparator.reverseOrder());
    }
}
