package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.SettlementTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface SettlementTypeRepository extends JpaRepository<SettlementTypeEntity, Integer>, JpaSpecificationExecutor<SettlementTypeEntity> {

}