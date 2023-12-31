package com.stanzaliving.collector.dto;

import com.stanzaliving.dashboard.dto.FeElementDto;
import com.stanzaliving.dashboard.dto.GraphLineYPoint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class GraphLineYPointRentDashboard extends GraphLineYPoint {
    Double y;
    FeElementDto amount;
    Double percent;
    String heading;
}