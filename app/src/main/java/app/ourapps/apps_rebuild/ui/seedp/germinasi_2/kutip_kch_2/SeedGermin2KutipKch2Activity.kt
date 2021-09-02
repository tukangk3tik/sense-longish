package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_kch_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2KutipKch2Binding

class SeedGermin2KutipKch2Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2KutipKch2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2KutipKch2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}