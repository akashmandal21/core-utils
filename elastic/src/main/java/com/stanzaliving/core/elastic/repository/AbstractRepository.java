package com.stanzaliving.core.elastic.repository;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.stanzaliving.core.elastic.dto.AbstractIndexDto;

@NoRepositoryBean
public interface AbstractRepository<T extends AbstractIndexDto, I extends Serializable> extends PagingAndSortingRepository<T, I> {

}