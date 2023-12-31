package com.example.aboutme

import android.os.Bundle
import android.view.View
import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding
import com.example.aboutme.ui.theme.AboutMeTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName : MyName = MyName("Devansh Sati")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        findViewById<Button>(R.id.clickBtn).setOnClickListener { addNickName(it) }
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.clickBtn.setOnClickListener { addNickName(it) }
        binding.myName = myName
    }

    private fun addNickName(view: View) {
        binding.apply {
//            viewText.text = inputText.text
            myName?.nickName = inputText.text.toString()
            invalidateAll()
            inputText.visibility = View.GONE
            clickBtn.visibility = View.GONE
            viewText.visibility = View.VISIBLE
        }
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AboutMeTheme {
        Greeting("Android")
    }
}