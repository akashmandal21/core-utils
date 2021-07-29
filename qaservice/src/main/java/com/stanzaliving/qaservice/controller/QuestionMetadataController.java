package com.stanzaliving.qaservice.controller;

import java.util.List;

import javax.validation.Valid;

import com.stanzaliving.qaservice.dto.QuestionMetadataDto;
import com.stanzaliving.qaservice.dto.metadata.*;
import com.stanzaliving.qaservice.entity.QuestionMetadataEntity;
import com.stanzaliving.qaservice.service.QuestionMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.stanzaliving.core.base.common.dto.ResponseDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Question Metadata Controller")
@RequestMapping("/questionMetadata")
//@RestController
public class QuestionMetadataController {

    @Autowired
    private QuestionMetadataService questionMetadataService;

    Gson gson = new Gson();

    @ApiOperation(value="Get metadata for all questions")
    @GetMapping("getAllQuestionMetadata")
    public ResponseDto<List<QuestionMetadataDto>> getAllQuestionMetadata() {
        return ResponseDto.success(questionMetadataService.findAll());
    }

    @ApiOperation(value="Add Metadata for Text type")
    @PostMapping("addTextQuestionMetadata")
    public ResponseDto<QuestionMetadataEntity> addTextQuestionMetadata(@RequestBody @Valid TextQuestion textQuestionMetadata) {
        QuestionMetadataEntity questionMetadata = new QuestionMetadataEntity(gson.toJson(textQuestionMetadata));
        questionMetadataService.save(questionMetadata);
        return ResponseDto.success("Question metadata added successfully", questionMetadata);
    }

    @ApiOperation(value="Add Metadata for Single Choice Or Multiple Choice")
    @PostMapping("addSingleOrMultipleChoiceQuestionMetadata")
    public ResponseDto<QuestionMetadataEntity> addSingleOrMultipleChoiceQuestionMetadata(@RequestBody @Valid SingleOrMultipleChoice singleOrMultipleChoice) {
        QuestionMetadataEntity questionMetadata = new QuestionMetadataEntity(gson.toJson(singleOrMultipleChoice));
        questionMetadataService.save(questionMetadata);
        return ResponseDto.success("Question metadata added successfully", questionMetadata);
    }

    //TODO: Validate question also, before accepting metadata
    @ApiOperation(value="Add Metadata for On Tap Questions")
    @PostMapping("addOnTapQuestionMetadata")
    public ResponseDto<QuestionMetadataEntity> addOnTapQuestionMetadata(@RequestBody @Valid OnTapQuestion onTapQuestion) {
        QuestionMetadataEntity questionMetadata = new QuestionMetadataEntity(gson.toJson(onTapQuestion));
        questionMetadataService.save(questionMetadata);
        return ResponseDto.success("Question metadata added successfully", questionMetadata);
    }

    @ApiOperation(value="Add Metadata for k Questions")
    @PostMapping("addkQuestionMetadata")
    public ResponseDto<QuestionMetadataEntity> addkQuestionMetadata(@RequestBody @Valid KQuestion kQuestion) {
        QuestionMetadataEntity questionMetadata = new QuestionMetadataEntity(gson.toJson(kQuestion));
        questionMetadataService.save(questionMetadata);
        return ResponseDto.success("Question metadata added successfully", questionMetadata);
    }

    @ApiOperation(value="Add Metadata for Building Boundary")
    @PostMapping("addBuildingBoundaryQuestionMetadata")
    public ResponseDto<QuestionMetadataEntity> addBuildingBoundaryQuestionMetadata(@RequestBody @Valid BuildingBoundaryQuestion buildingBoundaryQuestion) {
        QuestionMetadataEntity questionMetadata = new QuestionMetadataEntity(gson.toJson(buildingBoundaryQuestion));
        questionMetadataService.save(questionMetadata);
        return ResponseDto.success("Question metadata added successfully", questionMetadata);
    }

}
