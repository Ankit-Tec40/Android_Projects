package com.griffinlpu.griffin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment

class Authentication : AppCompatActivity(),FragmentNavigation {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        supportFragmentManager.beginTransaction()
            .add(R.id.authentication_container,login())
            .commit()
    }

    override fun navigationFrag(fragment: Fragment, addToStack: Boolean) {
        val transition=supportFragmentManager
            .beginTransaction()
            .replace(R.id.authentication_container,fragment)

        if(addToStack){
            transition.addToBackStack(null)
        }
        transition.commit()
    }
}