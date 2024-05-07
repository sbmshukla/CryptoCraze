package `in`.sbmshukla.cryptocraze.activity

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import `in`.sbmshukla.cryptocraze.R
import `in`.sbmshukla.cryptocraze.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@IntroActivity, R.layout.activity_intro)

        binding.apply {

            startButton.setOnClickListener {
                startActivity(Intent(this@IntroActivity, MainActivity::class.java))
            }
        }

        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
    }
}