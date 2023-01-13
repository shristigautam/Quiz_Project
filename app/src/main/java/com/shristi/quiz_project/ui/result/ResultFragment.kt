package com.shristi.quiz_project.ui.result

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.view.View.OnClickListener
import androidx.lifecycle.ViewModelProvider
import com.shristi.quiz_project.R
import com.shristi.quiz_project.data.QuizData
import com.shristi.quiz_project.databinding.FragmentResultBinding
import com.shristi.quiz_project.ui.AnswerViewModel
import com.shristi.quiz_project.ui.SecondSplashScreen
import com.shristi.quiz_project.ui.SplashScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultFragment : Fragment(R.layout.fragment_result), OnClickListener {

    private var sizeOfData: Int = 0
    private lateinit var binding: FragmentResultBinding
    private lateinit var viewModel: AnswerViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialSetup(view)

        viewModel.data.observe(viewLifecycleOwner) { quizList ->
            quizList?.let {
                var totalScore = 0
                sizeOfData = it.size
                it.forEach { quiz ->
                    Log.v("ResultFragment",quiz.userAnswer.toString())
                    if (quiz.answer == quiz.userAnswer) {
                        totalScore++
                    }
                    else{
                        print("Wrong answer" + quiz.userAnswer)
                    }
                }
                initData(totalScore)
            }
        }

    }

    private fun initData(totalScore: Int) {
        binding.totalQuestionsCol.text = sizeOfData.toString()
        binding.correctAnswerCol.text =  totalScore.toString()
        binding.wrongAnswerCol.text = (sizeOfData - totalScore).toString()
        binding.yourScoreCol.text = totalScore.toString() + " / " + sizeOfData.toString()

    }

    private fun initialSetup(view: View) {
        binding = FragmentResultBinding.bind(view)
        viewModel = ViewModelProvider(requireActivity())[AnswerViewModel::class.java]

        binding.tryAgainButton.setOnClickListener(this)
        binding.resultAnalysisButton.setOnClickListener(this)
    }

    companion object {
        @JvmStatic
        fun newInstance() = ResultFragment()
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.try_again_button -> {
                resetDB()
                val intent = Intent(activity, SecondSplashScreen::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }
            R.id.result_analysis_button -> {
                val intent = Intent(activity, ResultAnalysisActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun resetDB() {
        viewModel.resetDatabase(QuizData.getQuizQuestions())
    }
}