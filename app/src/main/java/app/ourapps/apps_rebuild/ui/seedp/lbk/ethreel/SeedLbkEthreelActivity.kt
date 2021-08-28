package app.ourapps.apps_rebuild.ui.seedp.lbk.ethreel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkEthreelBinding

class SeedLbkEthreelActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkEthreelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkEthreelBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}