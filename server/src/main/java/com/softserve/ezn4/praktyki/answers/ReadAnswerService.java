package com.softserve.ezn4.praktyki.answers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadAnswerService {
    List<AnswerDTO> findAnswersByTeacherWithCalculatedGrade(Long teacherID, AnswerFilter filter) {
        return List.of(
                new AnswerDTO(1L, AnswerType.QUIZ, "Milosz", 7.6),
                new AnswerDTO(1L, AnswerType.QUIZ, "Bartosz", 5.6),
                new AnswerDTO(1L, AnswerType.TEST, "Mikolaj", 8.4));
    }

    List<CommentDTO> findAnswerCommentsByID(Long answerID) {
        return List.of(
                new CommentDTO( "Milosz", 7.6, "Dobra robota!"),
                new CommentDTO( "Bartosz", 8.9, "Super!"));
    }
}
