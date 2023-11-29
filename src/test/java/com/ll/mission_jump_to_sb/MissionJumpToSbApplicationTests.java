package com.ll.mission_jump_to_sb;

import com.ll.mission_jump_to_sb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MissionJumpToSbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
       for(int i=1; i<=300; i++) {
           String subject = String.format("테스트 데이터:[%03d]", i);
           // 17 -> 017
           String content = "내용 없음";
           this.questionService.create(subject, content, null);
       }
    }

}
