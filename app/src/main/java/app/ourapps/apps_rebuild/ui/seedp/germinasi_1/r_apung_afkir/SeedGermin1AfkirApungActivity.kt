package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung_afkir

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1AfkirApungBinding

class SeedGermin1AfkirApungActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1AfkirApungBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1AfkirApungBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}