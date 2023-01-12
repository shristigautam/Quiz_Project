package com.shristi.quiz_project.ui.result

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.shristi.quiz_project.R
import com.shristi.quiz_project.databinding.ActivityResultAnalysisBinding
import com.shristi.quiz_project.ui.QuizViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultAnalysisActivity : AppCompatActivity(R.layout.activity_result_analysis) {

    private lateinit var binding : ActivityResultAnalysisBinding
    private val viewModel: QuizViewModel by viewModels()
    private lateinit var adapter: ResultAnalysisAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultAnalysisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()

        loadData()
    }

    private fun initRecyclerView() {
        adapter = ResultAnalysisAdapter()
        binding.resultAnalysisRecyclerView.adapter = adapter
    }

    private fun loadData() {
        viewModel.data.observe(this){quizList ->
            quizList?.let {
                adapter.updateList(it)
            }
        }
    }
}