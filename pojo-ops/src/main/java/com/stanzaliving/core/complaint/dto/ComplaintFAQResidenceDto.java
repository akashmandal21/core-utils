package com.stanzaliving.core.complaint.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintFAQResidenceDto {

	private String complaintFAQResidenceUuid;

    @NotBlank(message = "Complaint FAQ uuid can't be blank")
    private String complaintFAQUuid;

    @NotBlank(message = "Residence id can't be blank")
    private String residenceId;

    @NotBlank(message = "Complaint type uuid can't be blank")
    private String complaintTypeUuid;

    private boolean commonlyAskedQuestion;

}
