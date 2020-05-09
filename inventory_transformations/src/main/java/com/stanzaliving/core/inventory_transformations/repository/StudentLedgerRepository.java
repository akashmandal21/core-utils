package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentLedgerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentLedgerRepository extends JpaRepository<StudentLedgerEntity, Integer>, JpaSpecificationExecutor<StudentLedgerEntity> {

}