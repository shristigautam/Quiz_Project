package com.shristi.quiz_project.ui.checkBoxQuestions

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.shristi.quiz_project.R
import com.shristi.quiz_project.data.Quiz
import com.shristi.quiz_project.databinding.FragmentCheckBoxQuestionBinding
import com.shristi.quiz_project.ui.QuizViewModel
import com.shristi.quiz_project.util.CheckClickInterface
import com.google.gson.Gson
import com.shristi.quiz_project.data.Answers
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CheckBoxQuestionFragment : Fragment(R.layout.fragment_check_box_question), CheckClickInterface {

    private lateinit var quiz: Quiz
    private lateinit var viewModel: QuizViewModel
    private lateinit var binding: FragmentCheckBoxQuestionBinding
    private var checkedOptions: ArrayList<Answers> = arrayListOf()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getArgumentsData()

        initSetup(view)
    }

    private fun getArgumentsData() {
        arguments?.let {
            quiz = Gson().fromJson(it.getString("quiz"), Quiz::class.java)
        }
    }

    private fun initSetup(view: View) {
        binding = FragmentCheckBoxQuestionBinding.bind(view)
        viewModel = ViewModelProvider(requireActivity())[QuizViewModel::class.java]

        binding.questionTextView.text = quiz.question

        //initializing recycler view
        val adapter = CBQuestionAdapter(quiz.options, this)
        binding.optionsRecyclerView.adapter = adapter
    }

    override fun onCheckBoxChecked(optionsSelected: Answers) {
        checkedOptions.add(optionsSelected)
    }

    override fun onCheckBoxUnChecked(optionsSelected: Answers) {
        checkedOptions.remove(optionsSelected)
    }

    @SuppressLint("LongLogTag")
    override fun onPause() {
        super.onPause()
        var answer = ""
        var answerDesc = ""
        checkedOptions.sortedBy { it.option }
        checkedOptions.forEach { answerModel ->
            answer += when (answerModel.option) {
                0 -> "a"
                1 -> "b"
                2 -> "c"
                3 -> "d"
                else -> ""
            }
            answerDesc += answerModel.description+"\n"
        }

        //update the answer parameter of quiz object
        quiz.userAnswer = answer
        quiz.userAnswerDesc = answerDesc
        viewModel.saveUserAnswer(quiz)
        Log.v("CheckBoxQuestionFragment", "inserted data : $quiz")
    }

    companion object {

        @JvmStatic
        fun newInstance(quiz: String) = CheckBoxQuestionFragment().apply {
            arguments = Bundle().apply {
                putString("quiz", quiz)
            }
        }
    }
}