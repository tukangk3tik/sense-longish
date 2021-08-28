package app.ourapps.apps_rebuild.ui.seedp.lbk.penggonian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkPenggonianBinding

class SeedLbkPenggonianActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkPenggonianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkPenggonianBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}