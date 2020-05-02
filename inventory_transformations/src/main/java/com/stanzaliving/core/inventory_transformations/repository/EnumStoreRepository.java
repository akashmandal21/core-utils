package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.EnumStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EnumStoreRepository extends JpaRepository<EnumStore, String>, JpaSpecificationExecutor<EnumStore> {

}