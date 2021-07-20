package com.example.drugopredavanje

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.concurrent.SynchronousQueue

class ActivityThree: AppCompatActivity() {

    var broj: Int = 5
    lateinit var firstSquare: View
    lateinit var secondSquare: View
    lateinit var thirdSquare: View
    lateinit var fourthSquare: View
    lateinit var squareText: TextView
    lateinit var squareList: List<View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_three)
        firstSquare = findViewById(R.id.firstSquareView)
        secondSquare = findViewById(R.id.secondSquareView)
        thirdSquare = findViewById(R.id.thirdSquareView)
        fourthSquare = findViewById(R.id.fourthSquareView)
        squareText = findViewById(R.id.squareTextView)
        squareList = arrayListOf(firstSquare, secondSquare, thirdSquare, fourthSquare)
        firstSquare.setOnClickListener (squareOnClickListener)

        secondSquare.setOnClickListener(squareOnClickListener)

        thirdSquare.setOnClickListener(squareOnClickListener)

        fourthSquare.setOnClickListener(squareOnClickListener)

    }

    val squareOnClickListener: View.OnClickListener = View.OnClickListener {
        allInBlue()
        when(it.tag) {
            "1" -> {
                it.setBackgroundColor(resources.getColor(R.color.red))
                squareText.text = resources.getString(R.string.first_square)
            }
            "2" -> {
                it.setBackgroundColor(resources.getColor(R.color.red))
                squareText.text = "Second square clicked."
            }
            "3" -> {
                it.setBackgroundColor(resources.getColor(R.color.red))
                squareText.text = "Third square clicked."
            }
            "4" -> {
                it.setBackgroundColor(resources.getColor(R.color.red))
                squareText.text = "Fourth square clicked."
            }
            else -> {}
        }

    }

    fun allInBlue() {
        squareList.forEach {
            it.setBackgroundColor(resources.getColor(R.color.blue))
        }
    }




}