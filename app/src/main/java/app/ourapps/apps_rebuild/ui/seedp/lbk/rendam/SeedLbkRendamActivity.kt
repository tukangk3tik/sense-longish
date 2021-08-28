package app.ourapps.apps_rebuild.ui.seedp.lbk.rendam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkRendamBinding

class SeedLbkRendamActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkRendamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkRendamBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}