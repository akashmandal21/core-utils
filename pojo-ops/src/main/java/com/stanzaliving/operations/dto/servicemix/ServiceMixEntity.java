package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.operations.enums.ServiceMixStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ServiceMixEntity {

	private Long id;
	private String uuid;
	private Date createdAt;
	private String createdBy;
	private Date updatedAt;
	private String updatedBy;
	private boolean status;
	private String cityId;
	private String microMarketId; //Need to Change
	private String residenceId;
	private String versionName;
	private LocalDate fromDate;
	private Map<String, Object> config;
	private Long version;
	private String seasonUuid;
	private ServiceMixStatus serviceMixStatus;
	private String configDigest;
	private ApprovalStatus approvalStatus;
//	private ServiceMixSource serviceMixSource;
	private String consolidationRemarks;
	private String dealUuid;
	private DealCategory dealCategory;
	private String transformationChangeUuid;
	private boolean isDefault = false;
}
