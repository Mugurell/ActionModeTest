package com.petru.actionmodetest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionButton.setOnClickListener {
            FloatingActionModeCallback().startActionMode(it.rootView, R.menu.menu_actions)
        }
    }
}
