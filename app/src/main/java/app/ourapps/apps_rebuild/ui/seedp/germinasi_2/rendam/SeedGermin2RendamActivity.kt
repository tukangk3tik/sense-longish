package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.rendam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2RendamBinding

class SeedGermin2RendamActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2RendamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2RendamBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}