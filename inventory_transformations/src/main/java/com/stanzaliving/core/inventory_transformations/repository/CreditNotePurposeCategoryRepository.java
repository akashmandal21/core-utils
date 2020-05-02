package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CreditNotePurposeCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CreditNotePurposeCategoryRepository extends JpaRepository<CreditNotePurposeCategory, Integer>, JpaSpecificationExecutor<CreditNotePurposeCategory> {

}