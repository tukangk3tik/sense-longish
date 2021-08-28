package app.ourapps.apps_rebuild.ui.seedp.lbk.pengiriman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkPengirimanBinding

class SeedLbkPengirimanActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkPengirimanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkPengirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}