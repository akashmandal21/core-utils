package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.DateWiseRiskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Date;

public interface DateWiseRiskRepository extends JpaRepository<DateWiseRiskEntity, Date>, JpaSpecificationExecutor<DateWiseRiskEntity> {

}