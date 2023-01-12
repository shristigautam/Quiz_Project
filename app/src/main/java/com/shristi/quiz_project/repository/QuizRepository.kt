package com.shristi.quiz_project.repository

import com.shristi.quiz_project.data.Quiz

interface QuizRepository {
    suspend fun insertQuizQuestions(quizList : MutableList<Quiz>)
    suspend fun insertQuiz(quiz: Quiz)
    suspend fun getQuizList(): MutableList<Quiz>
    suspend fun resetQuestionSet()
}