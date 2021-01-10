package com.stanzaliving.qaservice.controller;

import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.exception.NoRecordException;
import com.stanzaliving.qaservice.dto.QuestionRequestDto;
import com.stanzaliving.qaservice.entity.QuestionEntity;
import com.stanzaliving.qaservice.service.QuestionService;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/question")
@RestController
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @ApiOperation(value = "Add Questions")
    @PostMapping("add")
    public ResponseDto<QuestionEntity> addQuestion(@RequestBody @Valid QuestionRequestDto questionRequestDTO) {

        // TODO: Verify exceptions and errors that might arise from Inside Of method
        return ResponseDto.success("Question added successfully", questionService.createQuestion(questionRequestDTO));
    }


    @GetMapping("{screenGroupNum}")
    public ResponseDto<List<QuestionEntity>> getActiveQuestionList(@PathVariable Integer screenGroupNum){
        List<QuestionEntity> questionEntityList = questionService.findByScreenGroupNumAndStatus(screenGroupNum, true);
        if (CollectionUtils.isEmpty(questionEntityList)) {
            throw new NoRecordException("No questions exist for screenGroupNum " + screenGroupNum);
        }
        return ResponseDto.success("Fetched questionEntityList successfully", questionEntityList);
    }

}
