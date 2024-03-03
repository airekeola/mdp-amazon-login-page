package com.airekeola.amazonloginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat
import com.airekeola.amazonloginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding:ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        this.viewBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(viewBinding.root);

        this.initialize();
    }

    private fun initialize(){
        viewBinding.instructionText.text = HtmlCompat.fromHtml(viewBinding.instructionText.text.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
    }
}
