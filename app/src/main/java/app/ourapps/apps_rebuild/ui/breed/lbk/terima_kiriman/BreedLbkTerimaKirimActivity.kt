package app.ourapps.apps_rebuild.ui.breed.lbk.terima_kiriman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkTerimaKirimBinding

class BreedLbkTerimaKirimActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkTerimaKirimBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkTerimaKirimBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}