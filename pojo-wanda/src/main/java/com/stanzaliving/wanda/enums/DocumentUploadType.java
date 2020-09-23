package com.stanzaliving.wanda.enums;

import java.util.ArrayList;
import java.util.List;

public enum DocumentUploadType {

	PASSPORT,PAN,ADHAAR_CARD,DRIVING_LICENSE,OTHERS,POLICE_VERIFICATION,VISA,SELFIE;
	
	private static List<DocumentUploadType> indianDocumentTypes = new ArrayList<DocumentUploadType>(4);

	private static List<DocumentUploadType> foriegnDocumentTypes = new ArrayList<DocumentUploadType>(4);
	
	private static List<DocumentUploadType> dualSideDocuments = new ArrayList<DocumentUploadType>(4);
	
	static {
		indianDocumentTypes.add(DRIVING_LICENSE);
		indianDocumentTypes.add(OTHERS);
		indianDocumentTypes.add(ADHAAR_CARD);
		indianDocumentTypes.add(PAN);
	
		foriegnDocumentTypes.add(PASSPORT);
		foriegnDocumentTypes.add(VISA);
		
		dualSideDocuments.add(PASSPORT);
		dualSideDocuments.add(ADHAAR_CARD);
		dualSideDocuments.add(DRIVING_LICENSE);
	}
	
	public static List<DocumentUploadType> getIndianDocuments(){
		return indianDocumentTypes;
	}
	
	public static List<DocumentUploadType> getForeignDocuments(){
		return foriegnDocumentTypes;
	}
	
	public static List<DocumentUploadType> getDualSideDocuments(){
		return dualSideDocuments;
	}
}