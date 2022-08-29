package com.stanzaliving.website.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Jacksonized
public class ImageLibraryDto extends AbstractDto {

    private String imageUrl;

    private boolean sampleImage;

    @Builder.Default
    private boolean clickable = false;

    @Builder.Default
    private List<Integer> asasdf = new ArrayList<>();

    @Builder.Default
    private List<Integer> badf = Arrays.asList(1,2,3);
}
