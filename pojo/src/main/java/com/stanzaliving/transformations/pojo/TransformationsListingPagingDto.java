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
public class TransformationsListingPagingDto {
    private List<TransformationsListingDto> data;
    private Long totalPages;
    private Long currentPage;
    private Long totalRecords;
}
