package com.stanzaliving.core.mongobase.entity;

import com.stanzaliving.core.mongobase.UserUtil;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.AfterSaveEvent;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import java.util.Date;
import java.util.UUID;

@Log4j2
public  class MongoEventListener extends AbstractMongoEventListener<Object> {

	@Autowired
	private MongoOperations mongoOperations;
	
	@Autowired(required = false)
	private MongoAfterSaveStrategy mongoAfterSaveStrategy;

	@Override
	public void onBeforeConvert(BeforeConvertEvent<Object> event) {

		Object source = event.getSource();

		if ((source instanceof AbstractMongoEntity)) {

			AbstractMongoEntity ver = (AbstractMongoEntity) source;

			if(ver.getUuid() == null) {
				ver.setUuid(UUID.randomUUID().toString());
			}

			if (ver.getCreatedAt() == null) {
				ver.setCreatedAt(new Date());
			}

			if (StringUtils.isBlank(ver.getCreatedBy())) {
				ver.setCreatedBy(UserUtil.getCurrentUserId());
			}

			if (StringUtils.isNotBlank(UserUtil.getCurrentUserId())) {
				ver.setUpdatedBy(UserUtil.getCurrentUserId());
			}

			ver.setUpdatedAt(new Date());
		}
	}

	@Override
	public void onAfterSave(AfterSaveEvent<Object> event) {
		if(mongoAfterSaveStrategy==null) {
			log.info("No strategy defined");
			return;
		}
		Object source = event.getSource();
		if ((source instanceof AbstractMongoEntity)) {
			mongoAfterSaveStrategy.afterSaveStrategy((AbstractMongoEntity) source);
		}
		
	}


}