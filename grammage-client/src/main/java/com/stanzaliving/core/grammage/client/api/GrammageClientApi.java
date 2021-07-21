package com.stanzaliving.core.grammage.client.api;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import com.stanzaliving.food.v2.grammage.response.MenuOptionGrammage;

import lombok.extern.log4j.Log4j2;

/**
 * @author Manish.Pareek
 *
 * @version 1.0
 *
 * @since 20-Jul-2021
 */

@Log4j2
public class GrammageClientApi {

	private final StanzaRestClient restClient;

	public GrammageClientApi(StanzaRestClient stanzaRestClient) {
		this.restClient = stanzaRestClient;
	}

	public void copyMenuCategory(String versionId, String uuid){

		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/copy").build()
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		queryParams.add("versionId", versionId);
		queryParams.add("uuid", uuid);

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<Void>> returnType = new ParameterizedTypeReference<ResponseDto<Void>>() {
        };
        
		try {
			restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);
		} catch (Exception e) {
			log.error("Error while copy", e);
		}

	}
	
	public Boolean isGrammageDefined(String versionId) {
        String path = UriComponentsBuilder.fromPath("/internal/category/grammage/exists").build().toUriString();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("versionId", versionId);
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Boolean>> returnType = new ParameterizedTypeReference<ResponseDto<Boolean>>() {
        };

        try {
            ResponseDto<Boolean> responseDto = restClient.invokeAPI(path, HttpMethod.GET, queryParams, null, headerParams, accept, returnType);
            return Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData()) && responseDto.getData();
        }catch (Exception e) {
            log.error("Error while checking isGrammageDefined", e);
            return null;
        }
    }
	
	
	public Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>> calculateGrammage(String versionId, Map<String, Map<LocalDate, Map<String, Collection<String>>>> optionWiseItemMap) {
		ResponseDto<Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>>> responseDto = null;
		String path = UriComponentsBuilder.fromPath("/internal/category/grammage/calculateGrammage").build().toUriString();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("versionId", versionId);
        queryParams.add("optionWiseItemMap", optionWiseItemMap.toString());
        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
        ParameterizedTypeReference<ResponseDto<Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>>>> returnType = new ParameterizedTypeReference<ResponseDto<Map<String, Map<LocalDate, Map<String, MenuOptionGrammage>>>>>() {
        };

        try {
             responseDto = restClient.invokeAPI(path, HttpMethod.POST, queryParams, null, headerParams, accept, returnType);            
        }catch (Exception e) {
            log.error("Error while calculateGrammage ", e);
            return null;
        }
        return (Objects.nonNull(responseDto) && Objects.nonNull(responseDto.getData())) ? responseDto.getData()
				: new HashMap<>();
    }
	

}

