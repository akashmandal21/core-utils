package com.stanzaliving.core.generictaskservice.client.api;

import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.generictaskservice.dto.GenericTaskDto;
import com.stanzaliving.generictaskservice.dto.ShiftAllocationDto;
import com.stanzaliving.generictaskservice.dto.StatusDto;
import com.stanzaliving.generictaskservice.dto.request.ProjectPlanningTaskNotStartedJobDto;
import com.stanzaliving.generictaskservice.dto.request.TaskRequestDto;
import com.stanzaliving.generictaskservice.dto.request.TaskSearchFilterRequestDto;
import com.stanzaliving.generictaskservice.dto.request.TaskStatusRequestDto;
import com.stanzaliving.generictaskservice.dto.response.GenericTaskResponseDto;
import com.stanzaliving.generictaskservice.dto.response.MicroClusterResponseDto;
import com.stanzaliving.generictaskservice.dto.response.ShitAllocationDetailsResponse;
import com.stanzaliving.projectplanningservice.dto.SectionDetailsDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Vikas S T
 * @date 09-Sep-21
 **/
@Log4j2
public class GenericTaskControllerApi {
    private StanzaRestClient restClient;

    public GenericTaskControllerApi(StanzaRestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseDto<List<ShiftAllocationDto>> createShiftAllocationDto(List<ShiftAllocationDto> shiftAllocationDtoList) {
        Object postBody = shiftAllocationDtoList;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/shift/allocation/saveAll").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<ShiftAllocationDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ShiftAllocationDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<ShitAllocationDetailsResponse>> getShiftAllocationDto(List<String> shiftAllocationUuids) {

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/shift/allocation").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.put("shiftAllocationUuidList", shiftAllocationUuids);
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<ShitAllocationDetailsResponse>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ShitAllocationDetailsResponse>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<MicroClusterResponseDto> getMicroClusterByUuid(String microClusterUuid) {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("microClusterUuid", microClusterUuid);
        String path = UriComponentsBuilder.fromPath("/microcluster/get/{microClusterUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<MicroClusterResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<MicroClusterResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<String>> getAllTaskUuidByTaskTemplate() {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/template/getTaskUuidByTaskTemplate").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

    }

    public ResponseDto<GenericTaskResponseDto> getTasks(String uuid) {
        // create path and map variable
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("taskId", uuid);
        String path = UriComponentsBuilder.fromPath("/task/{taskId}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<GenericTaskResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<GenericTaskResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
    }

    public ResponseDto<List<GenericTaskResponseDto>> getAllTasksListByOwnerID(String uuid) {
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("taskOwnerUuid", uuid);
        String path = UriComponentsBuilder.fromPath("/internal/task/task/{taskOwnerUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

    }

    /**
     * @param taskSearchFilterRequestDto
     * @return List of Generic tasks
     * @author Pradeep Naik R
     * GET TASKS WITH CHILD TASKS
     * @required ProjectPlanningService
     */
    public ResponseDto<List<GenericTaskResponseDto>> getGenericTaskByTaskIdList(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/get/childTasks").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<GenericTaskResponseDto>> getGenericTaskByTaskIdListWithStatus(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/get/childTasksWithStatus").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    /**
     * GET BY TASK UUID
     *
     * @param taskUuid
     * @return Generic task
     * @required ProjectPlanningService
     */
    public ResponseDto<GenericTaskDto> getGenericTaskById(String taskUuid) {
        Object getBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("taskId", taskUuid);
        String path = UriComponentsBuilder.fromPath("/internal/task/{taskId}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<GenericTaskDto>> returnType = new ParameterizedTypeReference<ResponseDto<GenericTaskDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, getBody, headerParams, accept, returnType);
    }

    /**
     * CREATE API
     *
     * @param genericTaskCreateRequest
     * @return Task Response Dto
     * @required Generic Task Request
     */
    public ResponseDto<GenericTaskDto> createGenericProjectPlanningTask(GenericTaskDto genericTaskCreateRequest) {
        Object postBody = genericTaskCreateRequest;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/add").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<GenericTaskDto>> returnType = new ParameterizedTypeReference<ResponseDto<GenericTaskDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    /**
     * UPDATE API
     *
     * @param genericTaskCreateRequest
     * @return Task Response Dto
     * @required Generic Task Request
     */
    public ResponseDto<GenericTaskDto> updateGenericProjectPlanningTask(GenericTaskDto genericTaskCreateRequest) {
        Object postBody = genericTaskCreateRequest;
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/update").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<GenericTaskDto>> returnType = new ParameterizedTypeReference<ResponseDto<GenericTaskDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, accept, returnType);
    }

    /**
     * GET TASKS BY NAME
     *
     * @param taskSearchFilterRequestDto
     * @return
     */
    public ResponseDto<PageResponse<GenericTaskResponseDto>> getGenericTaskByTaskIdListWithPaginationItems(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("pageNo", taskSearchFilterRequestDto.getPageRequest().getPageNo());
        uriVariables.put("limit", taskSearchFilterRequestDto.getPageRequest().getLimit());
        String path = UriComponentsBuilder.fromPath("/internal/task/get/name/{pageNo}/{limit}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<PageResponse<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<PageResponse<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    /**
     * @param taskSearchFilterRequestDto
     * @return
     * @author Pradeep Naik R
     * GET TASKS BY NAME
     */
    public ResponseDto<List<GenericTaskResponseDto>> getGenericTaskByNameUsingTaskIdList(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/get/name").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }


    /**
     * @param genericTaskUuid
     * @return
     * @author Pradeep Naik R
     * GET TASK WITH CHILD TASKS BY UUID
     */
    public ResponseDto<GenericTaskResponseDto> getGenericTaskWithChildTasksByUuid(String genericTaskUuid) {
        Object getBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("genericTaskUuid", genericTaskUuid);
        String path = UriComponentsBuilder.fromPath("/internal/task/get/childTasks/id/{genericTaskUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<GenericTaskResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<GenericTaskResponseDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, getBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<GenericTaskResponseDto>> deleteAllTasksByUuids(TaskRequestDto taskRequestDto) {
        Object getBody = taskRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/delete/ids").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);

    }

    public ResponseDto<List<GenericTaskResponseDto>> hardDeleteAllTasksByUuids(TaskRequestDto taskRequestDto) {
        Object getBody = taskRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/hard/delete/ids").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);

    }

    public ResponseDto<PageResponse<GenericTaskResponseDto>> getBySectionFilterRequestInputsWithPagination(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("pageNo", taskSearchFilterRequestDto.getPageRequest().getPageNo());
        uriVariables.put("limit", taskSearchFilterRequestDto.getPageRequest().getLimit());
        String path = UriComponentsBuilder.fromPath("/internal/task/get/tasks/{pageNo}/{limit}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<PageResponse<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<PageResponse<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    /**
     * @param taskSearchFilterRequestDto
     * @return List of GenericTaskResponseDto [ return Generic tasks for taskUuids passed, if not all Generic tasks ]
     * @author Pradeep Naik R
     * NOTE: Request should contain taskUuids [ optional ], taskTemplate [ true/false( Mandatory ) ]
     * @description FETCH GENERIC TASKS
     * Case1: GET ALL GENERIC TASKS
     * Case2: GET SPECIFIED GENERIC TASKS BY PASSING TASK UUIDS
     * Case3: QUERY BY MODULE UUIDS AND TASK UUIDS [ SEARCH BY FILTER CRITERIA ]
     */
    public ResponseDto<List<GenericTaskResponseDto>> getBySectionFilterRequestInputs(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/get/tasks").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    /**
     * @param taskSearchFilterRequestDto
     * @return
     * @author Pradeep Naik R
     * @description Fetches all the section along with tasks and subtasks as flat array
     * Case 1: Send section taskServiceUuids fetched by templateUuid, Prepare TaskSearchFilterRequestDto and set taskTemplate
     */
    public ResponseDto<List<GenericTaskResponseDto>> getSectionTasksAndSubTasksAsFlatArray(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/get/all").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    /**
     * Fetch by taskUuids
     *
     * @param taskSearchFilterRequestDto
     * @return
     */
    public ResponseDto<List<GenericTaskResponseDto>> getSectionTasksAndSubTasksBasedOnTaskUuids(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/get/tasks").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    /**
     * @param sectionDetailsDto
     * @return
     * @description GET status uuid for the respective pattern as input
     * [ NOT_STARTED, IN_PROGRESS, DELAYED, COMPLETED ]
     */
    public ResponseDto<List<StatusDto>> getTaskStatusByName(SectionDetailsDto sectionDetailsDto) {
        Object getBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("department", sectionDetailsDto.getDepartment());
        uriVariables.put("status", sectionDetailsDto.getTaskStatusName());
        String path = UriComponentsBuilder.fromPath("/internal/task/get/{department}/status/name/{status}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<StatusDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<StatusDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, getBody, headerParams, accept, returnType);
    }

    /**
     * @param sectionDetailsDto
     * @return
     * @description GET status uuid for the respective pattern as input
     * [ NOT_STARTED, IN_PROGRESS, DELAYED, COMPLETED ]
     */
    public ResponseDto<List<StatusDto>> getTaskStatusByUuid(SectionDetailsDto sectionDetailsDto) {
        Object getBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("department", sectionDetailsDto.getDepartment());
        uriVariables.put("statusUuid", sectionDetailsDto.getTaskStatusUuid());
        String path = UriComponentsBuilder.fromPath("/internal/task/get/{department}/status/id/{statusUuid}").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<StatusDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<StatusDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, getBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<GenericTaskResponseDto>> getAllTasksUnderParentSection(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/get/section/tasks").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<GenericTaskResponseDto>> getAllTasksUnderAllParentSections(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/get/all/section/tasks").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<GenericTaskResponseDto>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    public ResponseDto<List<String>> remindNotStartedTaskAsPerPlannedStartDate(ProjectPlanningTaskNotStartedJobDto projectPlanningTaskNotStartedJobDto) {
        Object getBody = projectPlanningTaskNotStartedJobDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/forNotStartedStatus").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<List<String>>> returnType = new ParameterizedTypeReference<ResponseDto<List<String>>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    public ResponseDto<StatusDto> getStatusBasedOnNameDeptModule(TaskStatusRequestDto taskStatusRequestDto) {
        Object getBody = taskStatusRequestDto;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task/forStatusNameDeptModule").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<StatusDto>> returnType = new ParameterizedTypeReference<ResponseDto<StatusDto>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }

    public ResponseDto updateOwnerInGTS(String taskUuid,String userUuid)
    {
        Object getBody = null;
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        String path = UriComponentsBuilder.fromPath("/internal/task//change/owner").buildAndExpand(uriVariables).toUriString();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("taskUuid", taskUuid);
        queryParams.add("userUuid", userUuid);
        final HttpHeaders headerParams = new HttpHeaders();
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto> returnType = new ParameterizedTypeReference<ResponseDto>() {
        };
        return restClient.invokeAPI(path, HttpMethod.POST, queryParams, getBody, headerParams, accept, returnType);
    }
}
