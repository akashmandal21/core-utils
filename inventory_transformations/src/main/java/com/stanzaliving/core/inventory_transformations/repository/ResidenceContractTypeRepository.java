package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceContractTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface ResidenceContractTypeRepository extends JpaRepository<ResidenceContractTypeEntity, Integer>, JpaSpecificationExecutor<ResidenceContractTypeEntity> {

}