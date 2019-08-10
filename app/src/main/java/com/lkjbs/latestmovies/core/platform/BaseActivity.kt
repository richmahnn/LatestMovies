package com.lkjbs.latestmovies.core.platform

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lkjbs.latestmovies.R.layout
import com.lkjbs.latestmovies.R.id
import com.lkjbs.latestmovies.core.extension.inTransaction
import kotlinx.android.synthetic.main.toolbar.*

/**
 * Base Activity class with helper methods for handling fragment transactions and back button
 * events.
 *
 * @see AppCompatActivity
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layout.activity_layout)
        setSupportActionBar(toolbar)

    }

    override fun onBackPressed() {
        (supportFragmentManager.findFragmentById(
            id.fragmentContainer) as BaseFragment).onBackPressed()
        super.onBackPressed()
    }

    private fun addFragment(savedInstanceState: Bundle?) =
        savedInstanceState ?: supportFragmentManager.inTransaction { add(id.fragmentContainer, fragment()) }

    abstract fun fragment() : BaseFragment

}