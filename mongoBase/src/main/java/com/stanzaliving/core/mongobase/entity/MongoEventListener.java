package com.stanzaliving.core.mongobase.entity;

import com.stanzaliving.core.security.helper.SecurityUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import java.util.Date;
import java.util.UUID;

public  class MongoEventListener extends AbstractMongoEventListener<Object> {

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Object> event) {
        Object source = event.getSource();
        if ((source instanceof AbstractMongoEntity)) {
            AbstractMongoEntity ver = (AbstractMongoEntity) source;
            if(ver.getUuid() == null)
                ver.setUuid(UUID.randomUUID().toString());
            if (ver.getCreatedAt() == null) {
                ver.setCreatedAt(new Date());
            }
            if (StringUtils.isBlank(ver.getCreatedBy())) {
                ver.setCreatedBy(SecurityUtils.getCurrentUserId());
            }
            if (StringUtils.isNotBlank(SecurityUtils.getCurrentUserId())) {
                ver.setUpdatedBy(SecurityUtils.getCurrentUserId());
            }
            ver.setUpdatedAt(new Date());
        }
    }

}