package com.coooldoggy.quiz_wideget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import com.coooldoggy.quiz_wideget.screen.QuizInputPage
import com.coooldoggy.quiz_wideget.ui.theme.Quiz_widegetTheme

class FileExActivity : ComponentActivity() {
    companion object{
        private val TAG = FileExActivity::class.java.simpleName
    }

    @ExperimentalComposeUiApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quiz_widegetTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    QuizInputPage().QuizInputPageScreen()
                }
            }
        }
    }
}


@ExperimentalComposeUiApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Quiz_widegetTheme {
        QuizInputPage().QuizInputPageScreen()
    }
}