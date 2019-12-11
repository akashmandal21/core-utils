package com.stanzaliving.comments.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Table(
		name = "comments")
@Entity(name = "comments")
public class CommentsEntity extends AbstractJpaEntity {

	private static final long serialVersionUID = -947751731338229446L;

	@Column(name = "context_id", columnDefinition = "varchar(40)", nullable = false)
	private String contextId;

	@Column(name = "context_type", columnDefinition = "varchar(40)", nullable = false)
	private String contextType;
	
	@Column(name = "comment_text", columnDefinition = "text", nullable = false)
	private String commentText;
	
}
