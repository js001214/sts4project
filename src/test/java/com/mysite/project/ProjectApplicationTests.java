package com.mysite.project;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.project.question.Question;
import com.mysite.project.question.QuestionRepository;
import com.mysite.project.question.QuestionService;

@SpringBootTest
class ProjectApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("질문 있어요!!:[%03d]", i);
            String content = "하하하하하";
            this.questionService.create(subject, content);
        }
    }

}
