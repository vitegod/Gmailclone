package com.example.gmailclone
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.graphics.drawable.ColorDrawable
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample data
        val emailList = listOf(
            Email("Edurila.com", "$19 Only (First 10 spots) - Bestselling...", "12:34 PM", true),
            Email("Chris Abad", "Help make Campaign Monitor better! Let us know your thoughs!", "11:22 AM", true),
            Email("Tuto.com", "8h de formation gratuite et les nouvea...", "11:04 AM", true),
            Email("support", "Société Ovh: suivi de vos services - hp...", "10:26 AM", true),
            Email("Matt from Ionic", "The New Ionic Creator Is Here!", "9:34 AM", true)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)


        val divider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        divider.setDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.divider_color)))
        recyclerView.addItemDecoration(divider)
    }
}
