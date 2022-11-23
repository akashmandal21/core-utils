package com.stanzaliving.dashboard.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class HistogramDto {
    private String chartTitle;

    private FeElementDto chartSubHeading;

    private String xLabel;

    private String yLabel;

    private String xType;

    private String yType;

    private AccessLevel accessLevel;

    @Builder.Default
    private List<GraphLineXPoint> xAxis = new ArrayList<>();

    @Builder.Default
    private List<GraphLineYPoint> yAxis = new ArrayList<>();
}
