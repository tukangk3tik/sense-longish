package app.ourapps.apps_rebuild.ui.seedp.lbk.kupas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkKupasBinding

class SeedLbkKupasActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkKupasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkKupasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}