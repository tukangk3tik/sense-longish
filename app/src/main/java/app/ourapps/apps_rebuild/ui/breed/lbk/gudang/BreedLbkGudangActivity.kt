package app.ourapps.apps_rebuild.ui.breed.lbk.gudang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ourapps.apps_rebuild.databinding.ActivityBreedLbkGudangBinding

class BreedLbkGudangActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedLbkGudangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedLbkGudangBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}