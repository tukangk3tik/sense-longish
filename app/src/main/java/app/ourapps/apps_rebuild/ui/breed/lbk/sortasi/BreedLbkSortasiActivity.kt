package app.ourapps.apps_rebuild.ui.breed.lbk.sortasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkSortasiBinding

class BreedLbkSortasiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkSortasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkSortasiBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}