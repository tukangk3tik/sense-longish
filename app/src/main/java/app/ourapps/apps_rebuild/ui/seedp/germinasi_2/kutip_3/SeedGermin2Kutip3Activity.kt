package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2Kutip3Binding

class SeedGermin2Kutip3Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2Kutip3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2Kutip3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}