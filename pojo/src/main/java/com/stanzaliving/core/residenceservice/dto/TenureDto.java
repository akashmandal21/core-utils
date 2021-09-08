package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class TenureDto implements Comparable {

    @NotBlank(message = "label should not be empty")
    private String label;
    @NotBlank(message = "value should not be empty")
    private String value;
    @NotBlank(message = "tenureId should not be empty")
    private String tenureId;
    
    private Long id;

    @Override
    public int compareTo(Object o) {
        return this.getValue().compareTo(((TenureDto) o).getValue());
    }
}
