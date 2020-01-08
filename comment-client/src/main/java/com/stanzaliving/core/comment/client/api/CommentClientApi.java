/**
 * 
 */
package com.stanzaliving.core.comment.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.commentsservice.dto.CommentsDto;

/**
 * @author naveen.kumar
 *
 * @date 03-Nov-2019
 *
 **/
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

}