
package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.model.Question;
import com.util.DBUtil;

public class QuestionDAO {
    public List<Question> getQuestionsByQuizId(int quizId) throws SQLException {
        List<Question> questions = new ArrayList<>();
        String sql = "SELECT * FROM questions WHERE quiz_id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, quizId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Question question = new Question();
                question.setId(rs.getInt("id"));
                question.setQuizId(rs.getInt("quiz_id"));
                question.setQuestionText(rs.getString("question_text"));
                question.setCorrectAnswer(rs.getString("correct_answer"));
                question.setPoints(rs.getInt("points"));
                questions.add(question);
            }
        }
        return questions;
    }
    
    public void saveQuestion(Question question) throws SQLException {
        String sql = "INSERT INTO questions (quiz_id, question_text, correct_answer, points) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, question.getQuizId());
            stmt.setString(2, question.getQuestionText());
            stmt.setString(3, question.getCorrectAnswer());
            stmt.setInt(4, question.getPoints());
            stmt.executeUpdate();
        }
    }
}