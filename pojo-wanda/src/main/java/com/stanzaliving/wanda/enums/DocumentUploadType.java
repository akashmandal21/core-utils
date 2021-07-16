package com.stanzaliving.wanda.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum DocumentUploadType {

	PASSPORT,PAN,REFERRAL_PAN,ADHAAR_CARD,DRIVING_LICENSE,OTHERS,POLICE_VERIFICATION,VISA,SELFIE;
	
	private static List<DocumentUploadType> indianDocumentTypes = new ArrayList<DocumentUploadType>(4);

	private static List<DocumentUploadType> foriegnDocumentTypes = new ArrayList<DocumentUploadType>(4);
	
	private static List<DocumentUploadType> dualSideDocuments = new ArrayList<DocumentUploadType>(4);

	private static Map<DocumentUploadType, String> documentName = new HashMap<>();

	static {
		indianDocumentTypes.add(DRIVING_LICENSE);
		indianDocumentTypes.add(OTHERS);
		indianDocumentTypes.add(ADHAAR_CARD);
		indianDocumentTypes.add(PAN);
		indianDocumentTypes.add(REFERRAL_PAN);
	
		foriegnDocumentTypes.add(PASSPORT);
		foriegnDocumentTypes.add(VISA);
		
		dualSideDocuments.add(PASSPORT);
		dualSideDocuments.add(ADHAAR_CARD);
		dualSideDocuments.add(DRIVING_LICENSE);
	}

	static {
		documentName.put(DRIVING_LICENSE, "Driving License");
		documentName.put(OTHERS, "Others");
		documentName.put(ADHAAR_CARD, "Aadhaar Card");
		documentName.put(PAN, "PAN");
		documentName.put(REFERRAL_PAN , "Referral Pan");

		documentName.put(PASSPORT, "Password");
		documentName.put(VISA, "VISA");

		documentName.put(PASSPORT, "Passport");
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

	public static String getDocumentName(DocumentUploadType documentUploadType){
		if(documentName.containsKey(documentUploadType)){
			return documentName.get(documentUploadType);
		}
		return null;
	}
}