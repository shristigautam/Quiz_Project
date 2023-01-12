package com.shristi.quiz_project.database

import android.content.Context
import androidx.room.Room
import com.shristi.quiz_project.constants.Constant
import com.shristi.quiz_project.data.QuizDAO

class QuizDB(context: Context) {

    private var quizDatabase: QuizDatabase = Room.databaseBuilder(
        context,
        QuizDatabase::class.java,
        Constant.DB_NAME
    ).build()

    fun getQuizDAO(): QuizDAO = quizDatabase.quizDAO
}