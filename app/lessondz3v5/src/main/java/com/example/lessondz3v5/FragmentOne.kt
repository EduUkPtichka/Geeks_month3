package com.example.lessondz3v5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragmentone, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvNull = requireActivity().findViewById<TextView>(R.id.tv_null)
        val button = requireActivity().findViewById<Button>(R.id.btn_one)

        button.setOnClickListener() {
            if(button.text.toString() == "Go next"){
                val bundle = Bundle()
                bundle.putString("text", tvNull.text.toString())

                val secondFragment = FragmentTwo()
                secondFragment.arguments =bundle
                val transaction=requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.conteyner,secondFragment).commit()
            }
            if (tvNull.text.toString().toInt() < 10 && button.text.toString() == "+1") {
                tvNull.text = (tvNull.text.toString().toInt() + 1).toString()
            }
            if(tvNull.text.toString().toInt() <= 10 && button.text.toString() == "-1"){
                tvNull.text = (tvNull.text.toString().toInt() - 1).toString()
            } else if(tvNull.text.toString().toInt() == 10)  {
                button.text = "-1"
            }

            if(tvNull.text.toString() == "0" && button.text.toString() == "-1"){
                button.text = "Go next"}


        }
    }


}