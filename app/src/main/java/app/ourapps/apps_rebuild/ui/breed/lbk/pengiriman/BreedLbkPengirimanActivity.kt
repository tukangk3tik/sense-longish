package app.ourapps.apps_rebuild.ui.breed.lbk.pengiriman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkPengirimanBinding

class BreedLbkPengirimanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkPengirimanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkPengirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}