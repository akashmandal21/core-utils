package com.stanzaliving.core.sqljpa.specification.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import com.stanzaliving.core.sqljpa.specification.StanzaSpecification;

public class StanzaSpecificationBuilder<T extends AbstractJpaEntity> {

	private final List<SearchCriteria> params;

	private final List<Specification<T>> externalSpecifications;

	public StanzaSpecificationBuilder() {
		params = new ArrayList<>();
		externalSpecifications = new ArrayList<>();
	}

	public StanzaSpecificationBuilder<T> with(String key, CriteriaOperation operation, Object value) {

		params.add(new SearchCriteria(key, operation, value));
		return this;
	}

	public void addExternalSpecification(Specification<T> specification) {
		externalSpecifications.add(specification);
	}

	public Specification<T> build() {

		if (params.isEmpty()) {
			return null;
		}

		List<Specification<T>> specs = addParamsToSpecification();

		specs.addAll(externalSpecifications);
		
		return generateFinalSpecificationFromList(specs);
	}

	private Specification<T> generateFinalSpecificationFromList(List<Specification<T>> specs) {

		Specification<T> result = specs.get(0);

		for (int i = 1; i < specs.size(); i++) {
			result = Specification.where(result).and(specs.get(i));
		}

		return result;
	}

	private List<Specification<T>> addParamsToSpecification() {

		List<Specification<T>> specs = new ArrayList<>();

		for (SearchCriteria param : params) {
			specs.add(new StanzaSpecification<T>(param));
		}

		return specs;
	}
}