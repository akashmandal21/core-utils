package com.stanzaliving.transformations.pojo;

import lombok.*;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 06/05/21
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BulkUpdateRequestDto {
    List<String> data;
}
