package com.stanzaliving.core.operations.dto.report.food.summary;

import com.stanzaliving.core.operations.dto.report.PercentDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceDto {

    PercentDto unsatisfied;

    PercentDto satisfied;

    int socialMediaComplaint;

    int disasterEvent;

    PercentDto shortage;

}
