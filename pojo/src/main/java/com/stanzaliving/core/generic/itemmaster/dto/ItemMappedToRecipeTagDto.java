package com.stanzaliving.core.generic.itemmaster.dto;

import com.stanzaliving.core.utilservice.annotations.Range;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 07/06/21
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ItemMappedToRecipeTagDto {
    private long itemsMapped;
    private long active;
    private long inactive;
}
