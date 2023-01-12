package com.shristi.quiz_project.ui.checkBoxQuestions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.recyclerview.widget.RecyclerView
import com.shristi.quiz_project.R
import com.shristi.quiz_project.data.Answers
import com.shristi.quiz_project.util.CheckClickInterface

class CBQuestionAdapter(
    private val options: MutableList<String> = mutableListOf(),
    private val listener: CheckClickInterface
) : RecyclerView.Adapter<CBQuestionAdapter.CBQuestionViewHolder>(){

    inner class CBQuestionViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val optionCB: CheckBox = view.findViewById(R.id.optionCB)
        fun bind(option: String) {
            optionCB.text = option
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CBQuestionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_check_option, parent, false)
        return CBQuestionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CBQuestionViewHolder, position: Int) {
        holder.bind(options[position])
        holder.optionCB.setOnClickListener {
            if (holder.optionCB.isChecked) {
                listener.onCheckBoxChecked(Answers(position,holder.optionCB.text.toString()))
            }else {
                listener.onCheckBoxUnChecked(Answers(position,holder.optionCB.text.toString()))
            }
        }
    }

    override fun getItemCount(): Int = options.size
}