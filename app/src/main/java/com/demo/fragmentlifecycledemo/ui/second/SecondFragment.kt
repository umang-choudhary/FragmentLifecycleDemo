package com.demo.fragmentlifecycledemo.ui.second

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.demo.fragmentlifecycledemo.R
import com.demo.fragmentlifecycledemo.printLog


/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    private val newData = "new_data"
    private var dataValue: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        printLog(this, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printLog(this, "onCreate")
        arguments?.let {
            dataValue = it.getString(newData)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        printLog(this, "onCreateView")
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val textViewSecond = view.findViewById<TextView>(R.id.textViewSecond)
        textViewSecond.text = dataValue
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param tagName Parameter 1.
         * @return A new instance of fragment SecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(tagName: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(newData, tagName)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        printLog(this, "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        printLog(this, "onStart")
    }

    override fun onResume() {
        super.onResume()
        printLog(this, "onResume")
    }

    override fun onPause() {
        super.onPause()
        printLog(this, "onPause")
    }

    override fun onStop() {
        super.onStop()
        printLog(this, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        printLog(this, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        printLog(this, "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        printLog(this, "onDetach")
    }
}