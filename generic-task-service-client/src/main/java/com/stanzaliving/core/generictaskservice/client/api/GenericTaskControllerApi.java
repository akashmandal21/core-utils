package com.stanzaliving.core.generictaskservice.client.api;

import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.user.acl.dto.RoleDto;
import com.stanzaliving.generictaskservice.dto.GenericTaskDto;
import com.stanzaliving.generictaskservice.dto.ShiftAllocationDto;
import com.stanzaliving.generictaskservice.dto.request.TaskSearchFilterRequestDto;
import com.stanzaliving.generictaskservice.dto.response.GenericTaskResponseDto;
import com.stanzaliving.generictaskservice.dto.response.MicroClusterResponseDto;
import com.stanzaliving.generictaskservice.dto.response.ShitAllocationDetailsResponse;
import com.stanzaliving.projectplanningservice.dto.request.SectionFilterRequestDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

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
        log.info("Path: {}", path);
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

        String path = UriComponentsBuilder.fromPath("/task/task/{taskOwnerUuid}").buildAndExpand(uriVariables).toUriString();
        log.info("Path: {}", path);
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
     * GET TASKS WITH CHILD TASKS
     *
     * @param taskSearchFilterRequestDto
     * @return List of Generic tasks
     * @required ProjectPlanningService
     */
    public ResponseDto<List<GenericTaskResponseDto>> getGenericTaskByTaskIdList(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/task/get/childTasks").buildAndExpand(uriVariables).toUriString();
        log.info("Path: {}", path);

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
        log.info("Path: {}", path);

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
        log.info("Path: {}", path);

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
     * GET TASKS BY NAME
     *
     * @param taskSearchFilterRequestDto
     * @return
     */
    public ResponseDto<List<GenericTaskResponseDto>> getGenericTaskByNameUsingTaskIdList(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/task/get/name").buildAndExpand(uriVariables).toUriString();
        log.info("Path: {}", path);

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
     * GET TASK WITH CHILD TASKS BY UUID
     *
     * @param genericTaskUuid
     * @return
     */
    public ResponseDto<GenericTaskResponseDto> getGenericTaskWithChildTasksByUuid(String genericTaskUuid) {
        Object getBody = null;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("genericTaskUuid", genericTaskUuid);

        String path = UriComponentsBuilder.fromPath("/internal/task/get/childTasks/id/{genericTaskUuid}").buildAndExpand(uriVariables).toUriString();
        log.info("Path: {}", path);

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

    public ResponseDto<Boolean> deleteAllTasksByUuids(List<String> uuids) {

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/task/delete/ids").buildAndExpand(uriVariables).toUriString();
        log.info("Path: {}", path);
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.put("uuids", uuids);

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };

        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };
        return restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);

    }

    public ResponseDto<PageResponse<GenericTaskResponseDto>> getBySectionFilterRequestInputsWithPagination(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("pageNo", taskSearchFilterRequestDto.getPageRequest().getPageNo());
        uriVariables.put("limit", taskSearchFilterRequestDto.getPageRequest().getLimit());

        String path = UriComponentsBuilder.fromPath("/internal/task/get/tasks/{pageNo}/{limit}").buildAndExpand(uriVariables).toUriString();
        log.info("Path: {}", path);

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

    public ResponseDto<List<GenericTaskResponseDto>> getBySectionFilterRequestInputs(TaskSearchFilterRequestDto taskSearchFilterRequestDto) {
        Object getBody = taskSearchFilterRequestDto;

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<>();

        String path = UriComponentsBuilder.fromPath("/internal/task/get/tasks").buildAndExpand(uriVariables).toUriString();
        log.info("Path: {}", path);

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
}
