package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.MicromarketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface MICROMARKETRepository extends JpaRepository<MicromarketEntity, Integer>, JpaSpecificationExecutor<MicromarketEntity> {

}