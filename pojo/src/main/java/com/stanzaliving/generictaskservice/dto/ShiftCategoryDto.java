package com.stanzaliving.generictaskservice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/**
 * @author Vikas S T
 * @date 16-Aug-21
 **/

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShiftCategoryDto{
    private String uuid;

    protected Date createdAt;

    protected String createdBy;

    protected Boolean status;

    private String parentShiftCategoryUuid;

    @NotBlank(message = "Shift category name is Mandatory.")
    private String shiftCategoryName;

    @NotBlank(message = "Module is Mandatory.")
    private String module;

    private List<ShiftCategoryDto> shiftSubCategoryList;
}
