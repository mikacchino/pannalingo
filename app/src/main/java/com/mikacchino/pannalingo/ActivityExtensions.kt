package com.mikacchino.pannalingo

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    // Begin transaction, complete changes and finally commit them
    beginTransaction().func().commit()
}

fun AppCompatActivity.replaceFragment(fragment: Fragment, frameId: Int) {
    // Replace the fragment in the frame
    supportFragmentManager.inTransaction{replace(frameId, fragment)}
}