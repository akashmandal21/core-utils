package com.stanzaliving.estate_v2.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class KeyValueDto implements Serializable, Cloneable {
    private String label;
    private String value;

    @Override
    public KeyValueDto clone() {
        try {
            return (KeyValueDto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
