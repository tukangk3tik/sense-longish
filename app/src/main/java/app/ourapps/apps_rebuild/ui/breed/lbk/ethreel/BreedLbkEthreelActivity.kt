package app.ourapps.apps_rebuild.ui.breed.lbk.ethreel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkEthreelBinding

class BreedLbkEthreelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkEthreelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkEthreelBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}