package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.function.BiConsumer;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerExperienceRecordDto extends RecordDto {

    int satisfied;
    int unsatisfied;
    int shortageCount;
    int totalCount;
    int foreignParticle;
    Double rcAvgQualityRating;
    int socialMediaComplaints;
    int onTimeDelivery;
    int quantityAdherence;
    int menuAdherence;
    int mealOrdered;
    int numStudentsFeedback;

    BiConsumer<CustomerExperienceRecordDto, CustomerExperienceRecordDto> aggregatedRowForAllCity = (o1, o2) -> {
        o1.setSatisfied(o1.getSatisfied() + o2.getSatisfied());
        o1.setUnsatisfied(o1.getUnsatisfied() + o2.getUnsatisfied());
        o1.setShortageCount(o1.getShortageCount() + o2.getShortageCount());
        o1.setTotalCount(o1.getTotalCount() + o2.getTotalCount());
        o1.setForeignParticle(o1.getForeignParticle() + o2.getForeignParticle());
        o1.setRcAvgQualityRating(o1.getRcAvgQualityRating() + o2.getRcAvgQualityRating());
        o1.setSocialMediaComplaints(o1.getSocialMediaComplaints() + o2.getSocialMediaComplaints());
        o1.setOnTimeDelivery(o1.getOnTimeDelivery() + o2.getOnTimeDelivery());
        o1.setQuantityAdherence(o1.getQuantityAdherence() + o2.getQuantityAdherence());
        o1.setMenuAdherence(o1.getMenuAdherence() + o2.getMenuAdherence());
        o1.setMealOrdered(o1.getMealOrdered() + o2.getMealOrdered());
        o1.setNumStudentsFeedback(o1.getNumStudentsFeedback() + o2.getNumStudentsFeedback());
    };
}
