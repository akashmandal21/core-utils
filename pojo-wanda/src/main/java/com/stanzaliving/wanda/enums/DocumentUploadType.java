package com.stanzaliving.wanda.enums;

import java.util.ArrayList;
import java.util.List;

public enum DocumentUploadType {

	PASSPORT,PAN,ADHAAR_CARD,DRIVING_LICENSE,OTHERS,POLICE_VERIFICATION,VISA,SELFIE,PROFILE_PICTURE;
	
	private static List<DocumentUploadType> indianDocumentTypes = new ArrayList<DocumentUploadType>(4);

	private static List<DocumentUploadType> foriegnDocumentTypes = new ArrayList<DocumentUploadType>(4);
	
	static {
		indianDocumentTypes.add(DRIVING_LICENSE);
		indianDocumentTypes.add(OTHERS);
		indianDocumentTypes.add(ADHAAR_CARD);
		indianDocumentTypes.add(PAN);
	
		foriegnDocumentTypes.add(PASSPORT);
		foriegnDocumentTypes.add(VISA);
	}
	
	public static List<DocumentUploadType> getIndianDocuments(){
		return indianDocumentTypes;
	}
	
	public static List<DocumentUploadType> getForeignDocuments(){
		return foriegnDocumentTypes;
	}
}