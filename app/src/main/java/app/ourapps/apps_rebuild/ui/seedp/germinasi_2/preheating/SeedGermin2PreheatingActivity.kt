package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.preheating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2PreheatingBinding

class SeedGermin2PreheatingActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2PreheatingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2PreheatingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}