package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.fungisida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1FungisidaBinding

class SeedGermin1FungisidaActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySeedGermin1FungisidaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1FungisidaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}