package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CreditcardTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CreditcardTransactionRepository extends JpaRepository<CreditcardTransaction, Integer>, JpaSpecificationExecutor<CreditcardTransaction> {

}