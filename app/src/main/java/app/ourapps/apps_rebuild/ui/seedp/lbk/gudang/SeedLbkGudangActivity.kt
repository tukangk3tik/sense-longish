package app.ourapps.apps_rebuild.ui.seedp.lbk.gudang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkGudangBinding

class SeedLbkGudangActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkGudangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkGudangBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}