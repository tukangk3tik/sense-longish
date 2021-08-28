package app.ourapps.apps_rebuild.ui.seedp.lbk.timbang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkTimbangBinding

class SeedLbkTimbangActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkTimbangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkTimbangBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}