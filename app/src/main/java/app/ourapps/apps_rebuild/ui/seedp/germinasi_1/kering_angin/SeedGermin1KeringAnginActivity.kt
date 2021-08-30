package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.kering_angin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1KeringAnginBinding

class SeedGermin1KeringAnginActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1KeringAnginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1KeringAnginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}