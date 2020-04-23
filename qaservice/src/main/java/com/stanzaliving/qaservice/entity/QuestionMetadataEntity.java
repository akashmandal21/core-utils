package com.stanzaliving.qaservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "question_metadata")
@Entity(name = "question_metadata")
@SuperBuilder
public class QuestionMetadataEntity extends AbstractJpaEntity {

    private static final long serialVersionUID = 3L;

    @Column(name = "metadata", columnDefinition = "text")
    private String metadata;



}