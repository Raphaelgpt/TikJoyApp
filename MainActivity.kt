
package com.example.tikjoy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tikjoy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPinPull.setOnClickListener {
            startActivity(Intent(this, PinPullActivity::class.java))
        }
        binding.btnLavaAvoid.setOnClickListener {
            startActivity(Intent(this, LavaAvoidActivity::class.java))
        }
        binding.btnDoorChoice.setOnClickListener {
            startActivity(Intent(this, DoorChoiceActivity::class.java))
        }
        binding.btnBridgeBuilder.setOnClickListener {
            startActivity(Intent(this, BridgeBuilderActivity::class.java))
        }
    }
}
