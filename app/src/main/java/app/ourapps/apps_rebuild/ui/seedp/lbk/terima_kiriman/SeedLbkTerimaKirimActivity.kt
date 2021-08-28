package app.ourapps.apps_rebuild.ui.seedp.lbk.terima_kiriman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkTerimaKirimBinding

class SeedLbkTerimaKirimActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkTerimaKirimBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkTerimaKirimBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}