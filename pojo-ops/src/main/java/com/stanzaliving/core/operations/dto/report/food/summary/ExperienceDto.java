package com.stanzaliving.core.operations.dto.report.food.summary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceDto {

    int unsatisfied;

    int satisfied;

    int socialMediaComplaints;

    int disasterEvents;

    int shortage;

}
