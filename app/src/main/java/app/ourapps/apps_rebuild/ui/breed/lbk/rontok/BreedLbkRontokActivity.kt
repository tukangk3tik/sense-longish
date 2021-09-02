package app.ourapps.apps_rebuild.ui.breed.lbk.rontok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkRontokBinding

class BreedLbkRontokActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkRontokBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkRontokBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}