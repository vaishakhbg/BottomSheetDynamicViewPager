package com.vbgapp.bottomsheetdynamicviewpager

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class TwoFragment : Fragment(){
    lateinit var runnable: Runnable

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.onefragment, container,false)
        val textView = view.findViewById<TextView>(R.id.targettext)

        var looper = 0
        val handler = Handler()
        runnable = Runnable {
            textView.text = looper.toString()
            looper += 1
            handler.postDelayed(runnable, 2000)
        }

        handler.post(runnable)


        return view
    }
}