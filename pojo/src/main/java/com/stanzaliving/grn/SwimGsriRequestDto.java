package com.stanzaliving.grn;

import com.stanzaliving.core.grsi.dto.GrsiItemDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class SwimGsriRequestDto {

    private String poToUuid;

    @NotBlank(message = "poToNumber cannot be blank")
    private String poToNumber;

    private List<GrsiItemDto> itemDetails;

    @NotBlank(message = "challanNumber cannot be blank")
    private String challanNumber;

    private String challanCopy;

    @NotNull(message = "grnDoneAt cannot be null")
    private Date grnDoneAt;

    @NotBlank(message = "grnDoneBy cannot be blank")
    private String grnDoneBy;

    @NotBlank(message = "awlRefNo cannot be blank")
    private String awlRefNo;
}
