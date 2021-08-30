package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1ApungBinding

class SeedGermin1ApungActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1ApungBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1ApungBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}