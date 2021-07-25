package com.stanzaliving.core.mongobase.entity;

import com.stanzaliving.core.mongobase.UserUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.AfterSaveEvent;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import javax.annotation.PostConstruct;
import java.util.*;

public  class MongoEventListener extends AbstractMongoEventListener<Object> {

	@Autowired
	private MongoOperations mongoOperations;

	@Autowired(required = false)
	private List<AfterSaveListener> afterSaveListener;

	private Map<Class,AfterSaveListener> listenerMap;

	@PostConstruct
	public void init() {

		listenerMap = new HashMap<>();

		if(afterSaveListener!=null) {
			afterSaveListener.stream().forEach(listener->{
				listenerMap.put(listener.getEntity(), listener);
			});
		}

	}

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
		Object source = event.getSource();
		if ((source instanceof AbstractMongoEntity)) {
			if(listenerMap.containsKey(source.getClass())) {
				listenerMap.get(source.getClass()).afterSave((AbstractMongoEntity)source);
			}
		}
	}


}