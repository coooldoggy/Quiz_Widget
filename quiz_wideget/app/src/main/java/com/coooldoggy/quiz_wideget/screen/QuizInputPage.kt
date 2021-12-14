package com.coooldoggy.quiz_wideget.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.coooldoggy.quiz_wideget.viewmodel.QuizInputPageViewModel

class QuizInputPage : Fragment() {
    companion object {
        private val TAG = QuizInputPage::class.java.simpleName
    }

    private val viewModel by viewModels<QuizInputPageViewModel>()


    @ExperimentalComposeUiApi
    @Composable
    fun QuizInputPageScreen() {
        QuizInputPageBody()
    }

    @ExperimentalComposeUiApi
    @Composable
    private fun QuizInputPageBody() {
        Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
            Box {
                QuizInputTextField(modifier = Modifier.align(Alignment.Center), onImeAction = {

                })
                saveButton(modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter).padding(bottom = 40.dp))
                loadButton(modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter))
            }

        }
    }

    @ExperimentalComposeUiApi
    @Composable
    private fun QuizInputTextField(
        modifier: Modifier, onImeAction: () -> Unit = {}
    ) {
        val keyboardController = LocalSoftwareKeyboardController.current
        TextField(
            value = viewModel.textState,
            onValueChange= {(changedValue) -> {viewModel.textState.value = changedValue}},
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Transparent),
            keyboardActions = KeyboardActions(onDone = {
                onImeAction()
                keyboardController?.hide()
            }),
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            modifier = modifier
        )
    }

    @Composable
    private fun saveButton(modifier: Modifier){
        Button(onClick = {

        },
            modifier = modifier,
            colors = ButtonDefaults.buttonColors(Color.LightGray)) {
            Text(text = "저장")
        }
    }

    @Composable
    private fun loadButton(modifier: Modifier){
        Button(onClick = { /*TODO*/ },
            modifier = modifier,
            colors = ButtonDefaults.buttonColors(Color.LightGray)) {
            Text(text = "불러오기")
        }
    }
}