package com.stanzaliving.residenceservice;

import com.stanzaliving.core.utilservice.annotations.ValidEnum;
import com.stanzaliving.residenceservice.enums.ResidenceAttributes;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookingAttributesDto {

    @NotNull(message = "Id cannot be blank")
    private Long id;

    @NotNull(message = "Uuid cannot be blank")
    private String uuid;

    @NotNull(message = "key cannot be blank")
    @ValidEnum(message = "${validatedValue} is not allowed", enumClass = ResidenceAttributes.class, fieldName = "key")
    private ResidenceAttributes key;

    @NotNull(message = "value cannot be blank")
    private String value;

    private String dataType;

    private String label;

    private String valueSuffix;

    public int getOrdinal() {
        return this.getKey().ordinal();
    }

}