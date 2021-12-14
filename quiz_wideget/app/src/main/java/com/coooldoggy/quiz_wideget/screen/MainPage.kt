package com.coooldoggy.quiz_wideget.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.fragment.app.Fragment

class MainPage: Fragment() {
    companion object{
        private val TAG = MainPage::class.java.simpleName
    }

    @Composable
    fun MainPageScreen(){
        Scaffold {
            MainScreenBody()
        }
    }

    @Composable
    private fun MainScreenBody(){
        Surface (
            color = Color.White,
            modifier = Modifier.fillMaxSize()
        ){
            Box {
               Button(onClick = { /*TODO*/ },
               modifier = Modifier
                   .fillMaxWidth()
                   .align(Alignment.BottomEnd),
               colors = ButtonDefaults.buttonColors(Color.LightGray)) {
                   Text(text = "정답, 오답 횟수 초기화")
               }
            }

        }

    }

}