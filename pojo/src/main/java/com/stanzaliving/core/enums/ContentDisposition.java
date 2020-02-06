/**
 * 
 */
package com.stanzaliving.core.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * Content-Disposition values
 * 
 * @author debendra.dhinda
 * @since 05-Feb-2020
 */
@Getter
@AllArgsConstructor
public enum ContentDisposition {

	INLINE("inline"),
	ATTACHMENT("attachment");
	
	private String contentDisposition;

	private static Map<ContentDisposition,String> contentDispositionMap = new HashMap<>();


	static{
		contentDispositionMap.put(INLINE, ContentDisposition.INLINE.getContentDisposition());
		contentDispositionMap.put(ATTACHMENT, ContentDisposition.ATTACHMENT.getContentDisposition());
	}
	public static Map<ContentDisposition, String> getAll() {
		return contentDispositionMap;
	}
}