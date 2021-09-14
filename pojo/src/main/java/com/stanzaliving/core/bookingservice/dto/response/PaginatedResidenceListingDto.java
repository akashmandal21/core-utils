package com.stanzaliving.core.bookingservice.dto.response;

import com.stanzaliving.core.ventaaggregationservice.dto.BookingResidenceAggregationEntityDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaginatedResidenceListingDto {

    private List<BookingResidenceAggregationEntityDto> residenceList;
    @Builder.Default
    private int size = 0;
    @Builder.Default
    private Long totalElements = 0L;
    @Builder.Default
    private int totalPages = 0;
    private int numberOfElements = 0;
    private int currentPage;
}
