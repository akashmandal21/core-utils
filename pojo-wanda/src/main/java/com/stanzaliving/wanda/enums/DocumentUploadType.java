package com.stanzaliving.wanda.enums;

import java.util.ArrayList;
import java.util.List;

public enum DocumentUploadType {

	PASSPORT,
	PAN,
	REFERRAL_PAN,
	ADHAAR_CARD,
	DRIVING_LICENSE,
	OTHERS,
	POLICE_VERIFICATION,
	POLICE_VERIFICATION_FORM,
	VISA,
	SELFIE,
	ID_CARD,
	VOTER_ID,
	FORM_C,
	MOVE_IN_DATE_CHANGE;

	private static List<DocumentUploadType> indianDocumentTypes = new ArrayList<DocumentUploadType>(4);

	private static List<DocumentUploadType> foriegnDocumentTypes = new ArrayList<DocumentUploadType>(4);

	private static List<DocumentUploadType> dualSideDocuments = new ArrayList<DocumentUploadType>(4);


	static {
		indianDocumentTypes.add(DRIVING_LICENSE);
		indianDocumentTypes.add(OTHERS);
		indianDocumentTypes.add(ADHAAR_CARD);
		indianDocumentTypes.add(PAN);
		indianDocumentTypes.add(REFERRAL_PAN);
		indianDocumentTypes.add(ID_CARD);
		indianDocumentTypes.add(VOTER_ID);

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
