package com.stanzaliving.core.sqljpa.entity;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.apache.commons.lang3.StringUtils;

import com.stanzaliving.core.base.utils.StanzaUtils;
import com.stanzaliving.core.sqljpa.SQLSecurityUtil;

/**
 * Entity listener for all Entities/Models
 *
 */
public class StanzaEntityListener {

	// This code will be executed before every insert into DB
	@PrePersist
	private void beforeInsert(AbstractJpaEntity abstractEntity) {
		if (abstractEntity.getCreatedAt() == null) {
			abstractEntity.setCreatedAt(new Date());
		}
		if (abstractEntity.getUpdatedAt() == null) {
			abstractEntity.setUpdatedAt(new Date());
		}

		if (StringUtils.isBlank(abstractEntity.getUuid())) {
			abstractEntity.setUuid(StanzaUtils.generateUniqueId());
		}

		if (StringUtils.isBlank(abstractEntity.getCreatedBy())) {
			abstractEntity.setCreatedBy(SQLSecurityUtil.getCurrentUserId());
		}
	}

	// This code will be executed before every update into DB
	@PreUpdate
	private void beforeUpdate(AbstractJpaEntity abstractEntity) {
		if (abstractEntity.getCreatedAt() == null) {
			abstractEntity.setCreatedAt(new Date());
		}

		if (StringUtils.isNotBlank(SQLSecurityUtil.getCurrentUserId())) {
			abstractEntity.setUpdatedBy(SQLSecurityUtil.getCurrentUserId());
		}

		abstractEntity.setUpdatedAt(new Date());
	}
}