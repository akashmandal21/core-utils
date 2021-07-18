package com.stanzaliving.core.mongobase.entity;

public interface MongoAfterSaveStrategy<T extends AbstractMongoEntity> {
    
    void afterSaveStrategy(T entity);
}
