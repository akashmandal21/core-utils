package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.far.enums.AmcType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.collections.CollectionUtils;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AmcDto {
    @NotNull
    private String amcDocumentNumber;
    private AmcType amcType;
    private String vendorName;
    private Date amcStartDate;
    private Date amcEndDate;
    private String pocName;
    private String pocContactNumber;
    private String pocEmail;
    private List<String> includes; // Multiple select options based on the item selected
    private List<String> excludes; // Multiple select options based on the item selected
    private List<String> amcDocumentPathList; // where the uploaded doc. by user is stored

    public boolean isEmpty() {
        return Objects.isNull(this.amcDocumentNumber) && Objects.isNull(this.amcType) && Objects.isNull(this.vendorName)
                && Objects.isNull(this.amcStartDate) && Objects.isNull(this.amcEndDate) && Objects.isNull(this.pocName)
                && Objects.isNull(this.pocContactNumber) && Objects.isNull(this.pocEmail) && CollectionUtils.isEmpty(this.amcDocumentPathList);
    }
}