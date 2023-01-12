package com.shristi.quiz_project.util

import com.shristi.quiz_project.data.Answers

interface CheckClickInterface {
    fun onCheckBoxChecked(optionsSelected: Answers)
    fun onCheckBoxUnChecked(optionsSelected: Answers)
}