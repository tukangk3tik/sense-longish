package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.r_gelap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2RgelapBinding

class SeedGermin2RGelapActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2RgelapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2RgelapBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}