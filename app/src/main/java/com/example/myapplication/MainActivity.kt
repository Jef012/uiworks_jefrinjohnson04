package com.example.myapplication

import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.TranslateAnimation
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_row.*
import java.util.ArrayList


class MainActivity : AppCompatActivity()

{
    private lateinit var view: TextView
    private var opened: Boolean = false

    private lateinit var newRecylerview: RecyclerView
    private lateinit var newArrayList: ArrayList<Companys>
    private lateinit var imageView: Array<Int>
    private lateinit var textView2: Array<String>
    private lateinit var textView3: Array<String>
    private lateinit var textView4: Array<String>
    private lateinit var textView5: Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view = findViewById(R.id.checkedTextView)
        view.visibility = View.INVISIBLE




        findViewById<View>(R.id.hide_show_button).setOnClickListener {
            if (!opened) {

                view.visibility = View.VISIBLE
            } else {
                view.visibility = View.INVISIBLE

            }
            opened = !opened
        }

        imageView = arrayOf(
            R.drawable.iphone_logo,
            R.drawable.meta_logo,
            R.drawable.amazon_logo,
            R.drawable.microsoft_logo,
            R.drawable.google_logo,
            R.drawable.whatsapp_logo,
            R.drawable.twitter_logo,
        )

        textView2 = arrayOf("Apple",
            "Meta",
            "Amazon",
            "Microsoft",
            "Google",
            "Whatsapp",
            "Twitter")


        textView3 = arrayOf("$1.565",
            "$1.678",
            "$3.455",
            "$1.768",
            "$2.486",
            "$2.358",
            "$1.256")


        textView4 = arrayOf("AAPL",
            "MTA",
            "AMZ",
            "MCR",
            "WAP",
            "GGLE",
            "TWR")

        textView5 = arrayOf("3.2% ↑",
            "4.3% ↑",
            "13.27% ↑",
            "6.5% ↑",
            "3.2% ↑",
            "6.5% ↑",
            "9.6% ↑")


        newRecylerview = findViewById(R.id.Ui_recyclerview)
        newRecylerview.layoutManager = LinearLayoutManager(this)
        newRecylerview.setHasFixedSize(true)

        newArrayList = arrayListOf<Companys>()
        getUserdata()

      val animDrawable = root_layout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(5000)
        animDrawable.start()


    }

    private fun getUserdata() {
         for(i in imageView.indices){
             val companys = Companys(
                 imageView[i],
                 textView2[i],
                 textView3[i],
                 textView4[i],
                 textView5[i],

             )

             newArrayList.add(companys)
         }

        newRecylerview.adapter = MyAdapter(newArrayList)
    }

}