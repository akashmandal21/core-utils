package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.DateWiseRisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.time.LocalDate;

public interface DateWiseRiskRepository extends JpaRepository<DateWiseRisk, LocalDate>, JpaSpecificationExecutor<DateWiseRisk> {

}