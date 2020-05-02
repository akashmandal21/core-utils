package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CommercialsCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommercialsCardRepository extends JpaRepository<CommercialsCard, Integer>, JpaSpecificationExecutor<CommercialsCard> {

}