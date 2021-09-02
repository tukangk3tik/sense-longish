package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_kch_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2KutipKch1Binding

class SeedGermin2KutipKch1Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2KutipKch1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2KutipKch1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}