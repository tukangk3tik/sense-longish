package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_panas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1RuangPanasBinding

class SeedGermin1RuangPanasActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1RuangPanasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1RuangPanasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}