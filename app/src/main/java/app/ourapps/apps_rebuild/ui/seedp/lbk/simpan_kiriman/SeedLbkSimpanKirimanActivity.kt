package app.ourapps.apps_rebuild.ui.seedp.lbk.simpan_kiriman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkSimpanKirimanBinding

class SeedLbkSimpanKirimanActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkSimpanKirimanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkSimpanKirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}