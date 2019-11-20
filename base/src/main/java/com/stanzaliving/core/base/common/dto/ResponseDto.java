/**
 * 
 */
package com.stanzaliving.core.base.common.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ResponseDto<T> {

	private boolean status;

	private String message;

	private String id;

	private String errorCode;

	private T data;
	
	private int httpStatusCode;

	//private Map<Department, Map<AccessLevel, Map<String, List<String>>>> aclMap;
	private Map<Department, List<String>> departmentRoleMap;



	private ResponseDto(boolean status) {
		this.status = status;

//		aclMap = new HashMap<>();
//
//		Map<AccessLevel, LevelDefination> nestedMap = new HashMap<>();
//
//
//		nestedMap.put(AccessLevel.CITY, new LevelDefination());
//
//		aclMap.put(Department.TECH, nestedMap);

		departmentRoleMap = new HashMap<>();
		departmentRoleMap.put(Department.TECH, Arrays.asList("mapView", "foodMenu"));
		departmentRoleMap.put(Department.FINANCE, Arrays.asList("termSheet", "rateReview", "superRole"));
	}

	private ResponseDto(boolean status, String message) {
		this(status);
		this.message = message;
	}

	private ResponseDto(boolean status, String message, T data) {
		this(status, message);
		this.data = data;
	}

	private ResponseDto(boolean status, String message, T data, String id) {
		this(status, message, data);
		this.id = id;
	}

	private ResponseDto(boolean status, String message, T data, String id, String errorCode) {
		this(status, message, data, id);
		this.errorCode = errorCode;
	}

	public static <T> ResponseDto<T> success(T data) {
		return new ResponseDto<>(true, null, data);
	}

	public static <T> ResponseDto<T> success(String message) {
		return new ResponseDto<>(true, message, null);
	}

	public static <T> ResponseDto<T> success(String message, T data) {
		return new ResponseDto<>(true, message, data);
	}

	public static <T> ResponseDto<T> success(String message, T data, String id) {
		return new ResponseDto<>(true, message, data, id);
	}

	public static <T> ResponseDto<T> failure(String message) {
		return new ResponseDto<>(false, message);
	}

	public static <T> ResponseDto<T> failure(String message, String id) {
		return new ResponseDto<>(false, message, null, id);
	}

	public static <T> ResponseDto<T> failure(String message, String id, String errorCode) {
		return new ResponseDto<>(false, message, null, id, errorCode);
	}

	public static <T> ResponseDto<T> failure(String message, T data) {
		return new ResponseDto<>(false, message, data);
	}

	public static <T> ResponseDto<T> failure(String message, T data, String id) {
		return new ResponseDto<>(false, message, data, id);
	}

	public static <T> ResponseDto<T> failure(String message, T data, String id, String errorCode) {
		return new ResponseDto<>(false, message, data, id, errorCode);
	}


}

@Data
class LevelDefination{
	List<String> accessLevelEntity = Arrays.asList("uuidOrCityObjectOfDelhi", "uuidOrCityObjectOfKanpur");
	List<String> roles = Arrays.asList("termSheet", "rateReview", "foodMenu");
}