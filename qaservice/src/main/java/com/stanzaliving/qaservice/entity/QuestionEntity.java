package com.stanzaliving.qaservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import com.stanzaliving.qaservice.dto.QuestionRequestDto;
import com.stanzaliving.qaservice.enums.QuestionType;
import com.stanzaliving.qaservice.enums.SubQuestionDisplay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "question", uniqueConstraints = {@UniqueConstraint(columnNames = {"screen_group_num", "screen_num", "order_num", "is_active"}),  @UniqueConstraint(columnNames = {"question_identifier"})})
@Entity(name = "question")
public class QuestionEntity extends AbstractJpaEntity {

    private static final long serialVersionUID = 1L;

    @Enumerated(EnumType.STRING)
    @Column(name = "question_type", columnDefinition = "varchar(30)", nullable = false)
    private QuestionType questionType;

    @Column(name = "frontend_type", columnDefinition = "varchar(128)", nullable = false)
    private String frontendType;

    @Column(name = "ques_heading", columnDefinition = "varchar(256)", nullable = false)
    private String quesHeading;

    @Column(name = "ques_sub_heading", columnDefinition = "varchar(256)")
    private String quesSubHeading;

    @Column(name = "is_mandatory", columnDefinition = "int(1)", nullable = false)
    private Integer isMandatory;

    @Column(name = "question_identifier", columnDefinition = "varchar(128)")
    private String questionIdentifier;

    @Column(name = "visibility_criteria", columnDefinition = "varchar(128)")
    private String visibilityCriteria;

    @Column(name = "screen_group_num", columnDefinition = "int(11)")
    private Integer screenGroupNum = 0;

    @Column(name = "screen_num", columnDefinition = "int(2)")
    private Integer screenNum = 0;

    @Column(name = "order_num", columnDefinition = "int(2)", nullable = false)
    private Integer orderNum = 0;

    @Enumerated(EnumType.STRING)
    @Column(name = "sub_question_display", columnDefinition = "varchar(30)")
    private SubQuestionDisplay subQuestionDisplay;

    @Column(name = "is_active", columnDefinition = "int(1)", nullable = false)
    private Integer isActive = 1;

    @Column(name = "metadata", columnDefinition = "varchar(2048)")
    private String metadata;

    public QuestionEntity(QuestionRequestDto questionRequestDto) {
        this.questionType = questionRequestDto.getQuestionType();   
        this.frontendType = questionRequestDto.getFrontendType();
        this.quesHeading = questionRequestDto.getQuesHeading();
        this.quesSubHeading = questionRequestDto.getQuesSubHeading();
        this.isMandatory = questionRequestDto.getIsMandatory();
        this.visibilityCriteria = questionRequestDto.getVisibilityCriteria();
        this.screenGroupNum = questionRequestDto.getScreenGroupNumber();
        this.screenNum = questionRequestDto.getScreenNumber();
        this.orderNum = questionRequestDto.getOrderNumber();
        this.subQuestionDisplay =  questionRequestDto.getSubQuestionDisplay() != null ? SubQuestionDisplay.valueOf(questionRequestDto.getSubQuestionDisplay()) : null;
        this.questionIdentifier = questionRequestDto.getQuestionIdentifier();
    }
}
