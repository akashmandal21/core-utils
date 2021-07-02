package com.stanzaliving.transformations.pojo;

import lombok.*;

import java.sql.Timestamp;

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
public class UpdatedByDto {
    private Timestamp time;
    private String doneBy;
}
