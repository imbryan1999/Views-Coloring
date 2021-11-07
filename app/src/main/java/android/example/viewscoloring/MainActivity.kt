package android.example.viewscoloring

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {

        // making clickable views
        val clickableViews : List<View> =
            listOf(box1_text,box2_text,box3_text,box4_text,box5_text, constraint_layout, buttonGreen,  buttonYellow, redButton)

        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when(view.id){
            R.id.box1_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box2_text -> view.setBackgroundColor(Color.GREEN)

            R.id.box3_text -> view.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.box4_text -> view.setBackgroundResource(android.R.color.holo_red_light)
            R.id.box5_text -> view.setBackgroundResource(android.R.color.holo_purple)

            R.id.redButton -> box3_text.setBackgroundResource(R.color.red)
            R.id.buttonYellow -> box4_text.setBackgroundResource(R.color.yellow)
            R.id.buttonGreen -> box5_text.setBackgroundResource(R.color.green)
             else -> view.setBackgroundColor(Color.GRAY)
        }
    }
}