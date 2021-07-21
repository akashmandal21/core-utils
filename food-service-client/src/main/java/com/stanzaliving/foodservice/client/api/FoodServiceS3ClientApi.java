package com.stanzaliving.foodservice.client.api;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.http.StanzaRestClient;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FoodServiceS3ClientApi {

    private StanzaRestClient restClient;

    public FoodServiceS3ClientApi(StanzaRestClient stanzaRestClient) {
        this.restClient = stanzaRestClient;
    }

    public String uploadToS3(String foodBucket, File file, String filePath, String contentType) {
    	
        ResponseDto<String> responseDto = null;
        String path = UriComponentsBuilder.fromPath("/internal/v2/common/amazon/s3/uploadToS3").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.put("foodBucket", Arrays.asList(foodBucket));
        queryParams.put("filePath", Arrays.asList(filePath));
        queryParams.put("contentType", Arrays.asList(contentType));

        final HttpHeaders headerParams = new HttpHeaders();

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

        ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
        };

        try {
            responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, file, headerParams, accept, returnType);
        } catch (Exception e) {
            log.error("Error while uploading to s3", e);
        }

        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

    }

	public String getPresignedUrl(String uploadedPath) {

		ResponseDto<String> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/v2/common/amazon/s3/getPresignedUrl").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.put("uploadedPath", Arrays.asList(uploadedPath));

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};

		try {
			responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept,
					returnType);
		} catch (Exception e) {
			log.error("Error while uploading to s3", e);
		}

		return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData() : null;

	}

}