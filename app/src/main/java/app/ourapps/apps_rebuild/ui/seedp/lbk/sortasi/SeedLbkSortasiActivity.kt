package app.ourapps.apps_rebuild.ui.seedp.lbk.sortasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkSortasiBinding

class SeedLbkSortasiActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkSortasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkSortasiBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}