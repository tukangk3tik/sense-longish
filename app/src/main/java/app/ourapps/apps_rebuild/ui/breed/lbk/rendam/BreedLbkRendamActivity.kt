package app.ourapps.apps_rebuild.ui.breed.lbk.rendam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkRendamBinding

class BreedLbkRendamActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkRendamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkRendamBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}