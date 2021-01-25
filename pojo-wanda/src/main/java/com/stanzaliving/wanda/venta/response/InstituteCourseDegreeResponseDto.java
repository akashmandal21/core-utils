package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class InstituteCourseDegreeResponseDto {
    private List<EducationalInstitutionResponseDto> educationalInstitutionResponseDTOList;
    private List<CourseResponseDto> courseResponseDTOList;
    private List<DegreeResponseDto> degreeResponseDTOList;
}