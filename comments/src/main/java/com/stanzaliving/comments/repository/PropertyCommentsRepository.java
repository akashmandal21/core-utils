/**
 * 
 */
package com.stanzaliving.comments.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.stanzaliving.comments.entity.CommentsEntity;
import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;

/**
 * @author naveen
 *
 * @date 13-Oct-2019
 */
@Repository
public interface PropertyCommentsRepository extends AbstractJpaRepository<CommentsEntity, Long> {

	Page<CommentsEntity> findByContextIdAndContextTypeOrderByCreatedAt(String contextId,String contextType, Pageable pageable);

}