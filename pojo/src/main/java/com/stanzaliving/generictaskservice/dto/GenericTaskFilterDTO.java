package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;


/**
 * @author Priyadarshini MB
 *
 */

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class GenericTaskFilterDTO {

    private String name;
    private String statusUUID;
    private String taskCategoryUUId;
    private String taskSubCategoryUUId;//taskType
    private List<String> tagsUUIds;//tags
    private List<String> taskOwnerlist;
    private Boolean overridable;
    private String module;
    private String priority;
    private String entityUUId;
    private String taskSubStatusUUId;
    private String entityType;
    private Boolean autoTaskCompletion;
    private boolean status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;
    @JsonIgnore
    private PaginationRequest pageRequest;


}
