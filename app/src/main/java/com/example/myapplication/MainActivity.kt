package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.ActionBarDrawerToggle
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var buttonDrawerToggle: View // Assuming it's a button, change the type accordingly

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.acivity_slide)

        // Initialize the drawer layout and toggle button
        drawerLayout = findViewById<DrawerLayout?>(R.id.drawerLayout) ?: throw NullPointerException("DrawerLayout not found")
        buttonDrawerToggle = findViewById<View?>(R.id.buttonDrawerToggle) ?: throw NullPointerException("ButtonDrawerToggle not found")


        // Set onClickListener using a lambda expression
        buttonDrawerToggle.setOnClickListener {
            drawerLayout.open() // Or GravityCompat.END, depending on your drawer layout
        }

        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            }
}
    }