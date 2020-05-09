package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.JdLeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JdLeadRepository extends JpaRepository<JdLeadEntity, String>, JpaSpecificationExecutor<JdLeadEntity> {

}