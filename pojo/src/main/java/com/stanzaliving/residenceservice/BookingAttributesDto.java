package com.stanzaliving.residenceservice;

import com.stanzaliving.core.utilservice.annotations.ValidEnum;
import com.stanzaliving.residenceservice.enums.ResidenceAttributes;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookingAttributesDto {

    @NotBlank(message = "Id cannot be blank")
    private Long id;
    @NotNull(message = "Uuid cannot be blank")

    private String uuid;
    @NotNull(message = "key cannot be blank")

    @ValidEnum(message = "${validatedValue} is not allowed", enumClass = ResidenceAttributes.class, fieldName = "key")
    private ResidenceAttributes key;

    @NotBlank(message = "value cannot be blank")
    private String value;

    private String dataType;
    private String label;
    private String valueSuffix;




}
