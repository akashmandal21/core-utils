package com.stanzaliving.core.projectservice.enums;

import lombok.Getter;

@Getter
public enum NotificationTaskType {

	PROPERTY_ASSIGNED,
	PROPERTY_REMOVED,
	SFR_SUBMITTED,
	OFR_COMPLETED,
	AS_IS_VENDOR_ASSIGNED,
	AS_IS_UPLOADED,
	AS_IS_REJECTED,
	AS_IS_APPROVED,

	GC_SCHEDULE_CREATED,
	
	FULL_PROJECT_SCHEDULE_CREATED_ON_APP,
	TASK_MARKED_STARTED_ON_APP,
	TASK_MARKED_DELAYED_ON_APP,
	TASK_MARKED_COMPLETED_ON_APP,
	DESIGN_BED_COUNT_SUBMITTED_WITH_NO_DEVIATION,
	DESIGN_BED_COUNT_SUBMITTED_WITH_DEVIATION,
	DESIGN_BED_COUNT_DEVIATION_APPROVED,
	DESIGN_BED_COUNT_SENT_BACK,

	GFC_DRAWINGS_UPLOADED,
	GFC_DRAWINGS_REJECTED,
	GFC_DRAWINGS_APPROVED,
	
	MASTER_BOQ_SUBMITTED,
	MASTER_BOQ_REJECTED,
	MASTER_BOQ_APPROVED,
	MASTER_BOI_APPROVED,
	MASTER_GC_APPROVED,

	HOTO_DOC_GENERATED,
	HOTO_DOC_MODIFIED,
	HOTO_SIGNED_UPLOADED,


	PO_SUBMITTED,
	PO_APPROVED,
	PO_REJECTED,

    GRN_BOI_ITEM_RECEIVED,
	GRN_BOI_ITEM_INSTALLATION,
	GRN_GC_ITEM_COMPLETION,

	PROPERTY_DROPPED;
}