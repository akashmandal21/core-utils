/**
 * 
 */
package com.stanzaliving.core.comment.client.api;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.commentsservice.dto.CommentsDto;
import com.stanzaliving.core.commentsservice.request.dto.CommentsGetRequest;
import com.stanzaliving.core.commentsservice.response.dto.CommentsCountResponseDto;
import com.stanzaliving.core.commentsservice.response.dto.CommentsResponseDto;
import com.stanzaliving.core.commentsservice.response.dto.ContextCommentsCountDto;
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
 * @author naveen.kumar
 *
 * @date 03-Nov-2019
 *
 **/
@Log4j2
public class CommentClientApi {

	private StanzaRestClient restClient;

	public CommentClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public ResponseDto<List<CommentsDto>> getAllCommentsByEstateUuid(String estateUuid) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("estateUuid", estateUuid);

		String path = UriComponentsBuilder.fromPath("/internal/get/all/{estateUuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<CommentsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CommentsDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<CommentsDto> postComment(CommentsDto commentsDto) {

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/post").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<CommentsDto>> returnType = new ParameterizedTypeReference<ResponseDto<CommentsDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, commentsDto, headerParams, accept, returnType);

	}

	public ResponseDto<List<CommentsDto>> getCommentsForAllContextId(String uuidCommaSeparatedList) {

		Object postBody = null;
		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("contextIds", uuidCommaSeparatedList);

		String path = UriComponentsBuilder.fromPath("/internal/get/multiple/{contextIds}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<CommentsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CommentsDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);

	}

	public ResponseDto<Void> postAllComments(List<CommentsDto> commentsDtos) {

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/post/multiple").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, commentsDtos, headerParams, accept, returnType);

	}

	public ResponseDto<List<CommentsDto>> getAllCommentsByContextIdAndSubContextId(String contextId,
			String subContextId) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("contextId", contextId);
		uriVariables.put("subContextId", subContextId);

		String path = UriComponentsBuilder.fromPath("/internal/get/all/context/{contextId}/subcontext/{subContextId}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<CommentsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CommentsDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}

	public ResponseDto<CommentsResponseDto> getCommentsForCommentsGetRequest(CommentsGetRequest commentsGetRequest) {

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/list").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<CommentsResponseDto>> returnType = new ParameterizedTypeReference<ResponseDto<CommentsResponseDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, commentsGetRequest, headerParams, accept, returnType);

	}

	public ResponseDto<List<CommentsDto>> getCommentsWithFilters(CommentsGetRequest commentsGetRequest) {

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/commentwithfilters").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<CommentsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CommentsDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, commentsGetRequest, headerParams, accept, returnType);

	}

	public ResponseDto<List<CommentsCountResponseDto>> getCommentCount(List<CommentsGetRequest> request) {

		final Map<String, Object> uriVariables = new HashMap<>();

		String path = UriComponentsBuilder.fromPath("/internal/get/comment/count").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<CommentsCountResponseDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CommentsCountResponseDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, request, headerParams, accept, returnType);
	}

	public ResponseDto<List<ContextCommentsCountDto>> getCommentCountByServiceNameAndContextType(String serviceName, String contextType, List<String> contextIds) {

		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("serviceName", serviceName);
		uriVariables.put("contextType", contextType);

		String path = UriComponentsBuilder.fromPath("/internal/get/comment/count/{serviceName}/{contextType}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<ContextCommentsCountDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<ContextCommentsCountDto>>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, contextIds, headerParams, accept, returnType);
	}

	public ResponseDto<List<CommentsDto>> getCommentsForContextId(String contextId) {

		Object postBody = null;
		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("contextId", contextId);

		String path = UriComponentsBuilder.fromPath("/internal/get/all/{contextId}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<CommentsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CommentsDto>>>() {
		};
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
		}catch (Exception e){
			log.error("Exception occurred while fetching comments for context with id:{}",contextId);
			return null;
		}

	}

	public ResponseDto<List<CommentsDto>> getLatestRejectionCommentForContextId(String contextId, String contextType) {

		Object postBody = null;
		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();

		uriVariables.put("contextId", contextId);
		uriVariables.put("contextType", contextType);

		String path = UriComponentsBuilder.fromPath("/internal/get/latest/{contextType}/{contextId}").buildAndExpand(uriVariables).toUriString();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<List<CommentsDto>>> returnType = new ParameterizedTypeReference<ResponseDto<List<CommentsDto>>>() {
		};
		try {
			return restClient.invokeAPI(path, HttpMethod.GET, null, postBody, headerParams, accept, returnType);
		}catch (Exception e){
			log.error("Exception occurred while fetching comments for context with id:{}",contextId);
			return null;
		}

	}


}