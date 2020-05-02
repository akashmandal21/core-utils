package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentAdditionalContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentAdditionalContactRepository extends JpaRepository<StudentAdditionalContact, String>, JpaSpecificationExecutor<StudentAdditionalContact> {

}