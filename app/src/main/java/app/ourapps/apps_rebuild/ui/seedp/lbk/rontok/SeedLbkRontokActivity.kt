package app.ourapps.apps_rebuild.ui.seedp.lbk.rontok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkRontokBinding

class SeedLbkRontokActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkRontokBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkRontokBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}