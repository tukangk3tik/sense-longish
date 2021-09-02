package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2Kutip2Binding

class SeedGermin2Kutip2Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2Kutip2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2Kutip2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}