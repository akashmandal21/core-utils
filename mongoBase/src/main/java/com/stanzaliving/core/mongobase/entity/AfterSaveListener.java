package com.stanzaliving.core.mongobase.entity;

public interface AfterSaveListener<T extends AbstractMongoEntity> {

    void afterSave(T entity);

    Class getEntity();
}
