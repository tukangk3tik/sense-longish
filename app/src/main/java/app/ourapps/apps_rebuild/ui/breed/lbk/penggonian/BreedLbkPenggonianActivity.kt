package app.ourapps.apps_rebuild.ui.breed.lbk.penggonian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkPenggonianBinding

class BreedLbkPenggonianActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkPenggonianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkPenggonianBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}