package com.shristi.quiz_project.util

import com.shristi.quiz_project.data.Quiz

interface RadioClickInterface {
    fun onRadioButtonClicked(optionPosition: Int, userAnswerDesc: String)
}