package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2Kutip5Binding

class SeedGermin2Kutip5Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2Kutip5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2Kutip5Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}