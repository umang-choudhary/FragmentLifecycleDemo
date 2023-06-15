package com.demo.fragmentlifecycledemo.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.demo.fragmentlifecycledemo.R
import com.demo.fragmentlifecycledemo.printLog

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        printLog(this, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printLog(this, "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        printLog(this, "onCreateView")
        return inflater.inflate(R.layout.main_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        printLog(this, "onViewCreated")
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
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