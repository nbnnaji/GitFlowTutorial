package com.example.nkechi_nnaji.gitflowtutorial

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , BottomNavigationView.OnNavigationItemSelectedListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //loading the default fragment
        loadFragment(HomeFragment())

        val navigation = findViewById<BottomNavigationView>(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener(this)
    }


    //Load fragment

    private fun loadFragment(fragment:Fragment?):Boolean{
        //Switch fragment
        if(fragment !=null){
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_content, fragment)
                .commit()
            return true
        }
        return false
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        var fragment: Fragment? = null

        when (item.itemId) {
            R.id.navigation_home -> fragment = HomeFragment()

            R.id.navigation_dashboard -> fragment = DashboardFragment()

//
//            R.id.navigation_notifications -> fragment = NotificationsFragment()
//
//            R.id.navigation_profile -> fragment = ProfileFragment()
        }

        return loadFragment(fragment)
    }

}
