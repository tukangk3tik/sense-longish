package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.suhu_r_panas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1SuhuRpanasBinding

class SeedGermin1SuhuRPanasActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1SuhuRpanasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1SuhuRpanasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}