package com.shristi.quiz_project.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.shristi.quiz_project.data.Quiz
import com.shristi.quiz_project.data.QuizDAO
import com.shristi.quiz_project.util.Converter

@Database(
    entities = [Quiz::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converter::class)
abstract class QuizDatabase: RoomDatabase() {
    abstract val quizDAO: QuizDAO
}