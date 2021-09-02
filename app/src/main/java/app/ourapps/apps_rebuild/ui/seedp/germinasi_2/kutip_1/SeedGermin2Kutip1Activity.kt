package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2Kutip1Binding

class SeedGermin2Kutip1Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2Kutip1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2Kutip1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}