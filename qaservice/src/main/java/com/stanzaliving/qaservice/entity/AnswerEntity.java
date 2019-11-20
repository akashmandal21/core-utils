package com.stanzaliving.qaservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "answer")
@Entity(name = "answer")
public class AnswerEntity extends AbstractJpaEntity {

    private static final long serialVersionUID = -7605609816131249236L;

	@Column(name = "estate_id", columnDefinition = "char(40)", nullable = false)
    private String estateId;

	@Column(name = "property_id", columnDefinition = "char(40")
	private String propertyId;
	
    @Column(name = "answerMap", columnDefinition = "text")
    private String answer;

}