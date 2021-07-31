package com.example.rest_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    lateinit var toogle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerlayout: DrawerLayout = findViewById(R.id.drawerlayout)
        val navview: NavigationView = findViewById(R.id.nav_view)

        toogle = ActionBarDrawerToggle(this,drawerlayout,R.string.open, R.string.close )
        drawerlayout.addDrawerListener(toogle)
        toogle.syncState()


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navview.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.all->  intent = Intent(this,allmatch::class.java)


            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toogle.onOptionsItemSelected(item)){
            return true
        }
   return super.onOptionsItemSelected(item)
    }


}