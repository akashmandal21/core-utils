package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstituteCourseDegreeResponseDto {
    List<EducationalInstitutionResponseDto> educationalInstitutionResponseDtoList;
    List<CourseResponseDto> courseResponseDtoList;
    List<DegreeResponseDto> degreeResponseDtoList;
}
