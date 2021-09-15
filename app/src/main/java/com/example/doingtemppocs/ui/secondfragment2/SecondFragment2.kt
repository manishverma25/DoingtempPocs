package com.example.doingtemppocs.ui.secondfragment2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.doingtemppocs.R

class SecondFragment2 : Fragment() {

    companion object {
        fun newInstance() = SecondFragment2()
    }

    private lateinit var viewModel: SecondFragment2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.second_fragment2_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SecondFragment2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}