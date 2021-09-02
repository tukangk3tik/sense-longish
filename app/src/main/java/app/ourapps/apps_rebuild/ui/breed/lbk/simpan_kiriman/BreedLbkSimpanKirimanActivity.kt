package app.ourapps.apps_rebuild.ui.breed.lbk.simpan_kiriman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkSimpanKirimanBinding

class BreedLbkSimpanKirimanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkSimpanKirimanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkSimpanKirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}