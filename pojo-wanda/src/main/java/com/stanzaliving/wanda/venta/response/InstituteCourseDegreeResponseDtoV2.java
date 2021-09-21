package com.stanzaliving.wanda.venta.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class InstituteCourseDegreeResponseDtoV2 {
	private List<EducationalInstitutionResponseDtoV2> educationalInstitutionResponseDTOList;
	private List<CourseResponseDtoV2> courseResponseDTOList;
	private List<DegreeResponseDtoV2> degreeResponseDTOList;
}