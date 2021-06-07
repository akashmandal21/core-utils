package com.stanzaliving.transformations.pojo;

import lombok.*;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 16/04/21
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DescriptiveDto {
    private List<String> enabled;
    private List<String> disabled;
    private Long count;
}
