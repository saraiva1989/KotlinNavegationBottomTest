package com.dalasmobile.bottomnavigationteste.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.dalasmobile.bottomnavigationteste.R

class IndicadoFragment : Fragment() {

    companion object {
        fun newInstance(): IndicadoFragment = IndicadoFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_indicado, container, false)
    }
}