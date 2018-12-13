package com.example.nkechi_nnaji.gitflowtutorial

import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * Created by Nkechi Nnaji on 12/13/18.
 * Description:
 */
class HomeFragment: Fragment() {
    private var fragView: View? = null

    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {

        fragView = inflater.inflate(R.layout.content_login_fragment, null)
        return fragView
    }

}