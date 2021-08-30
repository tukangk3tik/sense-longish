package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.rendam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1RendamBinding

class SeedGermin1RendamActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1RendamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1RendamBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}