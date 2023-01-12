package com.shristi.quiz_project.ui.radioButtonQuestions

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.shristi.quiz_project.R
import com.shristi.quiz_project.data.Quiz
import com.shristi.quiz_project.databinding.FragmentRadioButtonQuestionBinding
import com.shristi.quiz_project.ui.QuizViewModel
import com.shristi.quiz_project.util.RadioClickInterface
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RadioButtonQuestionFragment : Fragment(R.layout.fragment_radio_button_question), RadioClickInterface {
    private lateinit var quiz: Quiz
    private lateinit var viewModel: QuizViewModel
    private lateinit var binding: FragmentRadioButtonQuestionBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getArgumentsData()
        initSetup(view)
    }

    private fun initSetup(view: View) {
        binding = FragmentRadioButtonQuestionBinding.bind(view)
        viewModel = ViewModelProvider(requireActivity())[QuizViewModel::class.java]

        binding.questionTextView.text = quiz.question

        //initializing recycler view
        val adapter = RBQuestionAdapter(quiz.options, this)
        binding.optionsRecyclerView.adapter = adapter
    }

    override fun onRadioButtonClicked(optionPosition: Int) {
        quiz.userAnswer = when(optionPosition) {
            0 -> "a"
            1 -> "b"
            2 -> "c"
            3 -> "d"
            else -> ""
        }
        viewModel.saveUserAnswer(quiz)
    }

    private fun getArgumentsData() {
        arguments?.let {
            quiz = Gson().fromJson(it.getString("quiz"), Quiz::class.java)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(quiz: String) = RadioButtonQuestionFragment().apply {
            arguments = Bundle().apply {
                putString("quiz", quiz)
            }
        }
    }
}