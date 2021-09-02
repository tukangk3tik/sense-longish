package app.ourapps.apps_rebuild.ui.breed.lbk.kupas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkKupasBinding

class BreedLbkKupasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkKupasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkKupasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}