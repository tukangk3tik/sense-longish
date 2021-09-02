package app.ourapps.apps_rebuild.ui.breed.lbk.panen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkPanenBinding

class BreedLbkPanenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkPanenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkPanenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}