package com.stanzaliving.transformations.pojo;

import lombok.*;

import java.util.List;

/**
 * @author dhruv.mathur
 * @date 15/05/21
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditWarningDto {
    private List<String> name;
    private List<String> previousData;
    private List<String> newData;
}
