package com.coooldoggy.quiz_wideget.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel

class QuizInputPageViewModel: ViewModel() {
    companion object{
        private val TAG = QuizInputPageViewModel::class.java.simpleName
    }

    var textState = mutableStateOf(TextFieldValue())
}