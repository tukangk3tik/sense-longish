package app.ourapps.apps_rebuild.ui.breed.lbk.timbang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkTimbangBinding

class BreedLbkTimbangActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkTimbangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkTimbangBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}