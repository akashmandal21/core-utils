package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InstitutionDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InstitutionDocumentRepository extends JpaRepository<InstitutionDocument, Integer>, JpaSpecificationExecutor<InstitutionDocument> {

}