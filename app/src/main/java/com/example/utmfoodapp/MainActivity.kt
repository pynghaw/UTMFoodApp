package com.example.utmfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.utmfoodapp.databinding.ActivityMainBinding
import com.example.utmfoodapp.fragments.HomeFragment
import com.example.utmfoodapp.fragments.MessagesFragment
import com.example.utmfoodapp.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    //define variable
    private lateinit var binding : ActivityMainBinding
    private lateinit var bnvMenu : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)  //view binding format

        supportActionBar?.hide() //hide action bar
        bnvMenu = binding.bnvMenu

        //define fragment functions
        val homeFragment = HomeFragment()
        val messagesFragment = MessagesFragment()
        val profileFragment = ProfileFragment()

        setThatFragment(homeFragment) //set homeFragment to be viewed first

        //menu button selection
        bnvMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.homeMenu -> {
                    setThatFragment(homeFragment)  //sub in
                }
                R.id.messagesMenu -> {
                    setThatFragment(messagesFragment)
                }
                R.id.profileMenu -> {
                    setThatFragment(profileFragment)
                }
            }
            true
        }





    }

    //define navigation of fragment fun
    private fun setThatFragment(fragment : Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame,fragment)
            commit()
        }
}