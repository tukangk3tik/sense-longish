package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.aerasi_r_gelap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2AerasiRgelapBinding

class SeedGermin2AerasiRGelapActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2AerasiRgelapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2AerasiRgelapBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}