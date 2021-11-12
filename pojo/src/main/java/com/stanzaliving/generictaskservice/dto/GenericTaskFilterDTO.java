package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.core.base.enums.Department;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
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
@JsonIgnoreProperties({"pageRequest"})
public class GenericTaskFilterDTO {


    private String name;
    private String statusUuid;
    private String taskCategoryUuid;
    private String taskSubCategoryUuid;
    private List<String> tagsUuids;
    private PaginationRequest pageRequest;
    private List<String> taskOwnerlist;
    private Boolean overridable;
    private String module;
    private String entityType;
    private Boolean autoTaskCompletion;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationDateTo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationDateFrom;
    private String createdBy;
    private Department department;
    private List<String> taskStatusUUIdList;
    private List<String> taskSubStatusUUIdList;
    private List<String> taskSubCategoryUUIdList;
    private List<String> priorityList;
    private List<String> entityUUIdList;

}
